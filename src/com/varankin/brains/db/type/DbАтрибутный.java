package com.varankin.brains.db.type;

import com.varankin.brains.db.xml.МаркированныйЗонныйКлюч;
import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.Транзакция;
import com.varankin.util.LoggerX;
import java.lang.reflect.Array;
import java.util.logging.*;

/**
 * Атрибутный узел графа.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbАтрибутный 
{
    
    /**
     * @return маркированный ключ узла. 
     */
    МаркированныйЗонныйКлюч тип();
    
    /**
     * @return маркированные ключи всех фактических атрибутов узла.
     */
    Iterable<МаркированныйЗонныйКлюч> ключи();
    
    /**
     * Задает атрибут узла как объект базы данных. 
     * Пространство имен позволяет различать локальные атрибуты (атрибуты в 
     * пространстве имен элемента), от атрибутов из других
     * пространств имен, посредством URI. 
     * 
     * @param название название атрибута.
     * @param uri      идентификатор пространства имен (URI) атрибута, 
     *                  допустимо {@code null} для локальных атрибутов.
     * @param значение значение атрибута.
     */
    void определить( String название, String uri, Object значение );
    
    /**
     * Возвращает атрибут узла как объект базы данных.
     * 
     * @param название название атрибута.
     * @param uri      URI пространства имен атрибута, допустимо {@code null}.
     * @param замена   возвращаемое значение при отсутствии атрибута в базе данных.
     * @return значение запрошенного атрибута как объект базы данных.
     */
    Object атрибут( String название, String uri, Object замена );
    
    /**
     * Задает атрибут узла как объект базы данных. 
     * Пространство имен позволяет различать локальные атрибуты (атрибуты в 
     * пространстве имен элемента), от атрибутов из других
     * пространств имен, посредством URI в ключе. 
     * 
     * @param ключ полный идентификатор атрибута.
     * @param значение значение атрибута.
     */
    default void определить( МаркированныйЗонныйКлюч ключ, Object значение ) { определить( ключ.название(), ключ.uri(), значение ); }
    
    /**
     * Задает атрибут узла как объект базы данных. 
     * Пространство имен позволяет различать локальные атрибуты (атрибуты в 
     * пространстве имен элемента), от атрибутов из других
     * пространств имен, посредством URI в ключе. 
     * 
     * @param ключ полный идентификатор атрибута.
     * @param значение значение атрибута.
     */
    default void определить( ЗонныйКлюч ключ, Object значение ) { определить( ключ.НАЗВАНИЕ, ключ.ЗОНА, значение ); }
    
    /**
     * Возвращает атрибут узла как объект базы данных.
     * 
     * @param ключ полный идентификатор атрибута.
     * @param замена   возвращаемое значение при отсутствии атрибута в базе данных.
     * @return значение запрошенного атрибута как объект базы данных.
     */
    default Object атрибут( МаркированныйЗонныйКлюч ключ, Object замена ) { return атрибут( ключ.название(), ключ.uri(), замена ); }
    
    /**
     * Возвращает атрибут узла как объект базы данных.
     * 
     * @param ключ   полный идентификатор атрибута.
     * @param замена возвращаемое значение при отсутствии атрибута в базе данных.
     * @return значение запрошенного атрибута как объект базы данных.
     */
    default Object атрибут( ЗонныйКлюч ключ, Object замена ) { return атрибут( ключ.НАЗВАНИЕ, ключ.ЗОНА, замена ); }
    
    /**
     * Возвращает полное название узла в иерархии узлов.
     * 
     * @param разделитель текст, вставляемый между названиями отдельных объектов иерархии.
     * @return название объекта.
     */
    String положение( String разделитель );
    
    /**
     * @return возможность возврата объекта прежнему владельцу.
     */
    boolean восстановимый();
    
    /**
     * @return пакет, в составе которого находится данный узел.
     */
    DbПакет пакет();

    /**
     * @return архив, в составе которого находится данный узел.
     */
    DbАрхив архив();

    /**
     * @return узел, в составе коллекций которого находится данный узел.
     */
    DbАтрибутный предок();

    /**
     * @param поСвязи {@code true} если данный объект должен быть
     *          привязан к владельцу по какой-либо связи вхождения.
     * @return узел, в составе коллекций которого находится данный узел.
     */
    DbАтрибутный предок( boolean поСвязи );

    /**
     * Безвозвратно удаляет этот объект из базы данных.
     * 
     * @return {@code true} если объект был удален.
     */
    boolean удалить();
    
    /**
     * @return новая транзакция, привязанная к текущему процессу.
     */
    Транзакция транзакция();
    
    /**
     * Выполняет заданный оператор над узлом и подходящей коллекцией.
     * 
     * @param <X>      класс результата, возвращаемого оператором.
     * @param оператор оператор над узлом и коллекцией.
     * @param узел     узел базы данных.
     * @return результат, возвращенный оператором.
     * @exception NullPointerException если узел - {@code null}. 
     */
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        LoggerX logger = LoggerX.getLogger( DbАтрибутный.class );
        throw new UnsupportedOperationException( logger.text( "002002009S", 
                узел != null ? узел.тип().название() : null ) );
    }

    //TODO extract into separate interface
    //<editor-fold defaultstate="collapsed" desc="cast to basic types">
    
    static Boolean toBooleanValue( Object значение )
    {
        if( значение instanceof Boolean )
        {
            return (Boolean)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).intValue() != 0;
        }
        else if( значение instanceof String )
        {
            return Boolean.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Boolean.valueOf( String.valueOf( (char[])значение ) );
        }
        else 
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002001S", значение );
            return null;
        }
    }
    
    static Byte toByteValue( Object значение )
    {
        if( значение instanceof Byte )
        {
            return (Byte)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).byteValue();
        }
        else if( значение instanceof String )
        {
            return Byte.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Byte.valueOf( String.valueOf( (char[])значение ) );
        }
        else 
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002002S", значение );
            return null;
        }
    }
    
    static Character toCharacterValue( Object значение )
    {
        if( значение instanceof Character )
        {
            return (Character)значение;
        }
        else 
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002003S", значение );
            return null;
        }
    }
    
    static char[] toCharArrayValue( Object значение )
    {
        if( значение instanceof char[] )
        {
            return (char[])значение;
        }
        else if( значение instanceof String )
        {
            return ( (String)значение ).toCharArray();
        }
        else if( значение != null )
        {
            return значение.toString().toCharArray();
        }
        else
        {
            return null;
        }
    }
    
    static Short toShortValue( Object значение )
    {
        if( значение instanceof Short )
        {
            return (Short)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).shortValue();
        }
        else if( значение instanceof String )
        {
            return Short.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Short.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002004S", значение );
            return null;
        }
    }
    
    static Integer toIntegerValue( Object значение )
    {
        if( значение instanceof Integer )
        {
            return (Integer)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).intValue();
        }
        else if( значение instanceof String )
        {
            return Integer.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Integer.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002005S", значение );
            return null;
        }
    }
    
    static Long toLongValue( Object значение )
    {
        if( значение instanceof Long )
        {
            return (Long)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).longValue();
        }
        else if( значение instanceof String )
        {
            return Long.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Long.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002006S", значение );
            return null;
        }
    }
    
    static Float toFloatValue( Object значение )
    {
        if( значение instanceof Float )
        {
            return (Float)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).floatValue();
        }
        else if( значение instanceof String )
        {
            return Float.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Float.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002007S", значение );
            return null;
        }
    }
    
    static Double toDoubleValue( Object значение )
    {
        if( значение instanceof Double )
        {
            return (Double)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).doubleValue();
        }
        else if( значение instanceof String )
        {
            return Double.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Double.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            if( значение != null )
                LoggerX.getLogger(DbАтрибутный.class ).log( Level.SEVERE, "002002008S", значение );
            return null;
        }
    }
    
    static String toStringValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof char[] )
        {
            return String.valueOf( (char[])значение );
        }
        else if( значение.getClass().isArray() )
        {
            StringBuilder sb = new StringBuilder();
            for( int i = 0, max = Array.getLength( значение ); i < max; i++ )
                sb.append( Array.get( значение, i ) ).append( ' ' );
            return sb.toString().trim();
        }
        else if( значение instanceof String )
        {
            return (String)значение;
        }
        else
        {
            return значение.toString();
        }
    }
    
    static <T extends Enum<T>> T toEnumValue( Object значение, Class<T> cls )
    {
        Integer i = toIntegerValue( значение );
        T[] values = cls.getEnumConstants();
        return i != null && 0 <= i && i < values.length ? values[i] : null;
    }
    
    //</editor-fold>
    
}
