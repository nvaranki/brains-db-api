package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;

/**
 * Инструкция для обработки.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbИнструкция extends DbАтрибутный
{

    /**
     * @return код инструкции.
     */
    String код();
    
    /**
     * @param инструкция код инструкции.
     */
    void код( String инструкция );
    
    /**
     * @return название процессора обработки инструкций.
     */
    String процессор();
    
    /**
     * @param название название процессора обработки инструкций.
     */
    void процессор( String название );
    
    /**
     * @return результат выполнения инструкции.
     */
    String выполнить();
    
    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        throw new UnsupportedOperationException();
    }
    
}
