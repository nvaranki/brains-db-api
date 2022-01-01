package com.varankin.brains.db;

import com.varankin.brains.db.xml.XLinkShow;
import com.varankin.brains.db.xml.XLinkActuate;

/**
 * Элемент мыслительной структуры на основе образца (типа). 
 * Использует определения из XML зоны <a href="http://www.w3.org/1999/xlink" >XLink</a>
 * для ссылки на образец, его вида и момента реализации.
 * 
 * @param <T> класс экземпляра образца.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface Типовой<T> 
{
    
    /**
     * @return ссылка на образец (xlink:href).
     */
    String ссылка();
    
    /**
     * @param значение ссылка на образец (xlink:href).
     */
    void ссылка( String значение );
    
    /**
     * @return вид образца.
     */
    XLinkShow вид();
    
    /**
     * @param значение вид образца.
     */
    void вид( XLinkShow значение );
    
    /**
     * @return реализация образца.
     */
    public XLinkActuate реализация();
    
    /**
     * @param значение реализация образца.
     */
    void реализация( XLinkActuate значение );

    /**
     * @return экземпляр, созданный по образцу, допустимо {@code null}.
     */
    T экземпляр();

}
