package com.varankin.brains.db.xml;

/**
 * XML-дескриптор: XLink.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XLink
{
    String XMLNS_XLINK = "http://www.w3.org/1999/xlink";
    
    String XLINK_TITLE   = "title"; //TODO vs. XmlBrains.BRAINS_ATTR_NAME
    String XLINK_HREF    = "href";
    String XLINK_SHOW    = "show";
    String XLINK_ACTUATE = "actuate";
}
