package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Коллекция;

/**
 * Набор произвольных модулей, функций, классов и процессоров 
 * мыслительной структуры.
 * 
 * @author &copy; 2021 Николай Варанкин
 * 
 * @see DbПроект
 */
public interface DbБиблиотека extends DbЭлемент
{
    /**
     * @return поля библиотеки.
     */
    Коллекция<DbПоле> поля();

    /**
     * @return модули библиотеки.
     */
    Коллекция<DbМодуль> модули();

    /**
     * @return расчеты библиотеки.
     */
    Коллекция<DbРасчет> расчеты();

    /**
     * @return ленты времени библиотеки.
     */
    Коллекция<DbЛента> ленты();

    /**
     * @return процессоры библиотеки.
     */
    Коллекция<DbПроцессор> процессоры();

    /**
     * @return точки расчетов.
     */
    Коллекция<DbТочка> точки();

    /**
     * @return сенсоры полей.
     */
    Коллекция<DbСенсор> сенсоры();

    /**
     * @return классы библиотеки.
     */
    Коллекция<DbКлассJava> классы();

    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbПоле )
            результат = оператор.выполнить( (DbПоле)узел, поля() );
        else if( узел instanceof DbМодуль )
            результат = оператор.выполнить( (DbМодуль)узел, модули() );
        else if( узел instanceof DbРасчет )
            результат = оператор.выполнить( (DbРасчет)узел, расчеты() );
        else if( узел instanceof DbЛента )
            результат = оператор.выполнить( (DbЛента)узел, ленты() );
        else if( узел instanceof DbПроцессор )
            результат = оператор.выполнить( (DbПроцессор)узел, процессоры() );
        else if( узел instanceof DbКлассJava )
            результат = оператор.выполнить( (DbКлассJava)узел, классы() );
        else 
            результат = DbЭлемент.super.выполнить( оператор, узел );
        return результат;
    }

}
