package com.varankin.brains.db;

import com.varankin.brains.db.type.DbЭлемент;

/**
 * Объект, связанный с шаблоном элемента в архиве.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface Базовый
{

    /**
     * @return шаблон элемента в архиве.
     */
    DbЭлемент шаблон();
    
}
