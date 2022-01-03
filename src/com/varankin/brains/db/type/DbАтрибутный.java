package com.varankin.brains.db.type;

import com.varankin.brains.db.xml.МаркированныйЗонныйКлюч;
import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.Транзакция;
import com.varankin.util.LoggerX;

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

}
