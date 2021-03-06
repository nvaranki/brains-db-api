package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Коллекция;

/**
 * Блок контактов фрагмента мыслительной структуры. 
 * Соединения могут дублировать или дополнять друг друга. 
 * Они различаются по {@linkplain #название() названию}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbСоединение extends DbЭлемент
{
    
    /**
     * @return контакты соединения.
     */
    Коллекция<DbКонтакт> контакты();
    
    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbКонтакт )
            результат = оператор.выполнить( (DbКонтакт)узел, контакты() );
        else 
            результат = DbЭлемент.super.выполнить( оператор, узел );
        return результат;
    }
    
}
