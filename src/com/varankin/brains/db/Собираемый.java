package com.varankin.brains.db;

import java.util.Collection;

/**
 * Объект, участвующий в одном или нескольких вариантах сборки проекта.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface Собираемый
{

    /**
     * @return названия сборок проекта, в которых участвует данный элемент.
     */
    Collection<String> сборки();
    
}
