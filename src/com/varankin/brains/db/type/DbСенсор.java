package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Внешний;
import com.varankin.brains.db.Параметризованный;
import com.varankin.brains.db.Типовой;

/**
 * Сигнал, получаемый извне или формируемый собственным генератором.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbСенсор extends Параметризованный, Внешний, Типовой<DbСенсор>, DbЭлемент
{

    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbКлассJava )
            результат = оператор.выполнить( (DbКлассJava)узел, классы() );
        else if( узел instanceof DbПараметр )
            результат = оператор.выполнить( (DbПараметр)узел, параметры() );
        else 
            результат = DbЭлемент.super.выполнить( оператор, узел );
        return результат;
    }

}
