package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Коллекция;
import com.varankin.characteristic.Именованный;

/**
 * Пакет из проектов и библиотек мыслительных структур.
 * Используется при обмене с внешними системами.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbПакет extends DbУзел, Именованный
{

    /**
     * @return представление архива в виде набора проектов.
     */
    Коллекция<DbПроект> проекты();

    /**
     * @return представление архива в виде набора библиотек.
     */
    Коллекция<DbБиблиотека> библиотеки();
    
    /**
     * @return версия определения структуры данных пакета.
     */
    String версия();

    /**
     * @param значение название пакета.
     */
    void название( String значение );
    
    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbПроект )
            результат = оператор.выполнить( (DbПроект)узел, проекты() );
        else if( узел instanceof DbБиблиотека )
            результат = оператор.выполнить( (DbБиблиотека)узел, библиотеки() );
        else 
            результат = DbУзел.super.выполнить( оператор, узел );
        return результат;
    }
    
}
