package com.varankin.brains.db.type;

import com.varankin.characteristic.Именованный;
import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Коллекция;
import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.property.MutablePropertyHolder;
import com.varankin.property.PropertyMonitor;

import java.util.Date;
import java.util.function.Consumer;

/**
 * Архив мыслительных структур.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbАрхив extends DbАтрибутный, Именованный, MutablePropertyHolder, PropertyMonitor
{

    /**
     * Устанавливает новое название объекта.
     * 
     * @param значение название объекта.
     */
    void название( String значение );
    
    /**
     * @return представление архива в виде набора пакетов.
     */
    Коллекция<DbПакет> пакеты();

    /**
     * @return известные архиву пространства имен.
     */
    Коллекция<DbЗона> namespaces();

    /**
     * @return удаленные элементы.
     */
    Коллекция<DbМусор> мусор();

    /**
     * @return URI расположения архива.
     */
    String расположение();
    
    /**
     * @return дата и время создания архива.
     */
    Date создан();
    
    /**
     * @return дата и время изменения архива.
     */
    Date изменен();
    
    /**
     * @param значение обработчик событий по изменению архива и входящих в него элементов.
     */
    void обработчик( Consumer<DbАрхив> значение );

    /**
     * Создает новый элемент архива.
     * 
     * @param ключ публичный идентификатор элемента.
     * @return созданный элемент, без связи с другими элементами.
     */
    DbАтрибутный создатьНовыйЭлемент( ЗонныйКлюч ключ );

    /**
     * Создает, при необходимости, новое пространство имен.
     * 
     * @param uri      пространство имен.
     * @param префикс  название пространство имен.
     * @return пространство имен, соответствующее параметрам.
     */
    DbЗона определитьПространствоИмен( String uri, String префикс );
    
    /**
     * Отключает доступ ко всем операциям над архивом. Закрытый архив 
     * может быть открыт повторно.
     */
    void закрыть();

    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbПакет )
            результат = оператор.выполнить( (DbПакет)узел, пакеты() );
        else if( узел instanceof DbМусор )
            результат = оператор.выполнить( (DbМусор)узел, мусор() );
        else if( узел != null )
            throw new ClassCastException( узел.getClass().getName() );
        else 
            throw new NullPointerException();
        return результат;
    }

}
