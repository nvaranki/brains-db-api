package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Коллекция;
import com.varankin.brains.db.Собираемый;
import com.varankin.characteristic.Именованный;
import java.util.Collection;

/**
 * Основа элемента мыслительной структуры. Все элементы, основанные 
 * на ней, принадлежат пространству имен {@link XmlBrains#XMLNS_BRAINS}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbЭлемент extends DbУзел, Именованный, Собираемый
{

    /**
     * @return дополнительная информация об элементе.
     */
    Коллекция<DbЗаметка> заметки();
    
    /**
     * @return вложенные графические элементы.
     */
    Коллекция<DbГрафика> графики();

    /**
     * Устанавливает новое название объекта.
     * 
     * @param значение название объекта.
     */
    void название( String значение );
    
    /**
     * @param значение названия сборок проекта, в которых участвует данный элемент.
     */
    void сборки( Collection<String> значение );

    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbЗаметка )
            результат = оператор.выполнить( (DbЗаметка)узел, заметки() );
        else if( узел instanceof DbГрафика )
            результат = оператор.выполнить( (DbГрафика)узел, графики() );
        else 
            результат = DbУзел.super.выполнить( оператор, узел );
        return результат;
    }

}
