package com.varankin.brains.db;

import com.varankin.characteristic.Наблюдаемый;
import com.varankin.property.MutablePropertyHolder;
import com.varankin.property.PropertyMonitor;
import java.util.Collection;

/**
 * Расширение {@linkplain Collection коллекции} свойством наблюдаемости изменений.
 * 
 * @author &copy; 2016 Николай Варанкин
 * 
 * @param <E> класс элемента коллекции.
 */
public interface Коллекция<E> extends Collection<E>, Наблюдаемый<E>, MutablePropertyHolder, PropertyMonitor
{
    /**
     * Коллекция изменилась некоторым образом.
     */
    public String PROPERTY_UPDATED = "updated";
    /**
     * Коллекция потеряла элемент(ы).
     */
    public String PROPERTY_REMOVED = "deleted";
    /**
     * Коллекция приобрела элемент(ы).
     */
    public String PROPERTY_ADDED = "added";
}
