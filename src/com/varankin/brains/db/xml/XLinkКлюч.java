package com.varankin.brains.db.xml;

/**
 * Идентификатор элемента или атрибута в пространстве имен
 * ассоциативных структур {@link XLink#XMLNS_XLINK}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public class XLinkКлюч extends ЗонныйКлюч
{
    
    public XLinkКлюч( String название ) 
    {
        super( название, XLink.XMLNS_XLINK );
    }
    
}
