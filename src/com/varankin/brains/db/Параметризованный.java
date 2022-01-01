package com.varankin.brains.db;

import com.varankin.brains.db.type.DbПараметр;

/**
 * Объект, допускающий настройку параметрами.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface Параметризованный
{

    /**
     * @return параметры настройки.
     *
     * @see КлассJava
     */
    Коллекция<DbПараметр> параметры();
    
}
