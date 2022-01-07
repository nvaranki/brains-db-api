package com.varankin.brains.db.xml;

import java.net.URL;

/**
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlBrains 
{
    /** Короткая ссылка на описание XML-формата "brains".
      * Для применения в XML-файле пакета, например: 
      * {@literal <!DOCTYPE brains SYSTEM "brains.dtd" >} 
      */
    String DTD_SYSTEM_BRAINS = "brains.dtd";
    
    /** Встроенный экземпляр файла {@link #DTD_SYSTEM_BRAINS}. */
    URL URL_BRAINS_DTD = XmlBrains.class.getResource( "/xml/" + DTD_SYSTEM_BRAINS );

    // названия типов (начинающиеся с '#', не участвуют во внешнем вводе-выводе)
        
    // теги
    static final String XML_NODE_XMLNS = "#xmlns";
    static final String XML_ARHIVE = "#archive";
    static final String XML_BASKET = "#basket";
    static final String XML_BRAINS = "brains";
    static final String XML_LIBRARY = "library";
    static final String XML_MODULE = "module";
    static final String XML_PROJECT = "project";
    static final String XML_FIELD = "field";
    static final String XML_FRAGMENT = "fragment";
    static final String XML_JOINT = "joint";
    static final String XML_SENSOR = "sensor";
    static final String XML_FIELD_SENSOR_FUNCTION = "function";
    static final String XML_FIELD_SENSOR_FUNCTION_PIN = "pin";
    static final String XML_FUNCTION = "function";
    static final String XML_COMPUTE = "compute";
    static final String XML_PROCESSOR = "processor";
    static final String XML_SIGNAL = "signal";
    static final String XML_TIMELINE = "timeline";
    static final String XML_JAVA = "java";
    static final String XML_PARAMETER = "parameter";
    static final String XML_PIN = "pin";
    static final String XML_POINT = "point";
    static final String XML_NOTE = "note";
    static final String XML_ORIGIN = "origin";
    // атрибуты
    static final String XML_CHANGED = "changed";
    static final String XML_CREATED = "created";
    static final String XML_EXPORTED = "exported";
    static final String XML_IMPORTED = "imported";
    static final String XML_DELETED = "#deleted";
    static final String XML_ID = "id";
    static final String XML_IN = "i";
    static final String XML_OUT = "out";
    static final String XML_TYPE = "type";
    static final String XML_VALUE = "value";
    static final String XML_INDEX = "index";
    static final String XML_NAME = "name";
    static final String XML_PRIORITY = "priority";
    static final String XML_PROCESSOR_PAUSE = "pause";
    static final String XML_PROCESSOR_RESTART = "restart";
    static final String XML_PROBE = "probe";
    static final String XML_PAUSE = "pause";
    static final String XML_DELAY = "delay";
    static final String XML_INLINE = "inline";
    static final String XML_COLLAPSE = "collapse";
    static final String XML_PURGE = "purge";
    static final String XML_RESTART = "restart";
    static final String XML_STRATEGY = "strategy";
    static final String XML_THRESHOLD = "threshold";
    static final String XML_FUNCTION_TYPE = "type";
    static final String XML_FUNCTION_COMPUTE = "compute";
    static final String XML_PUBLIC = "public";
    static final String XML_URI = "uri";
    static final String XML_VERSION = "version";
    
    
    
    static final String BRAINS_ATTR_ASSEMBLY = "assembly";
    static final String BRAINS_ATTR_NAME = "name"; //TODO vs. Xml.XLINK_TITLE
    static final String BRAINS_ATTR_DETAIL = "detail";
    static final String BRAINS_ATTR_PURPOSE = "purpose";
    
    static final String XMLNS_BRAINS = "http://www.varankin.com/ns/brains";
    
}
