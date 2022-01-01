package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Коллекция;

/**
 * Хранилище удаленных элементов.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbМусор extends DbАтрибутный
{

    /**
     * @return удаленные элементы.
     */
    Коллекция<DbАтрибутный> мусор();
    
    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        return оператор.выполнить( узел, мусор() ); //TODO review!!!
    }
    
}
