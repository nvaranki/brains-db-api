package com.varankin.brains.db.xml;

/**
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface Xml 
{
    String XML_URI = "uri";
    String XML_XMLNS = "xmlns";
    String XML_VERSION = "version";
    String XML_TEXT = "#TEXT";
    String XML_LINE = "#LINE";
    String XML_NSA = "#ATTR";
    String XML_CDATA = "#CDATA";
    
    String PI_ELEMENT = "?";
    String PI_ATTR_TARGET = "#TARGET";
    String PI_ATTR_INSTRUCTION = "#INSTRUCTION";
    
    String CDATA_START = "<![CDATA[";
    String CDATA_STOP = "]]>";
    
    String XMLNS_XML = "http://www.w3.org/XML/1998/namespace";
    String XMLNS_PREFIX = "#PREFIX"; // история префикса пространства имен
    
}
