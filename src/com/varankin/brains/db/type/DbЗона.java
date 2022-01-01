package com.varankin.brains.db.type;

import com.varankin.characteristic.Именованный;
import java.util.List;

/**
 * Расширенное название пространства имен XML.
 * 
 * @see <a href="http://www.w3.org/TR/xml-names11/">Namespaces in XML 1.1 (Second Edition)</a>
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbЗона extends DbАтрибутный, Именованный
{
    /**
     * @return все варианты ссылок на URI (вторая часть атрибута XML xmlns:ссылка).
     */
    List<String> варианты();
    
    /**
     * @param значение варианты ссылок на URI (вторая часть атрибута XML xmlns:ссылка).
     */
    void варианты( List<String> значение );
    
    /**
     * @return актуальная ссылка на URI, вторая часть атрибута XML xmlns:ссылка.
     */
    @Override
    String название();
    
    /**
     * @param значение ссылка на URI, вторая часть атрибута XML xmlns:ссылка.
     */
    void название( String значение );
    
    /**
     * @return URI пространства имен.
     */
    String uri();
    
    /**
     * @param  значение URI пространства имен.
     */
    void uri( String значение );
    
}
