package com.varankin.brains.db.xml;

/**
 * Идентификатор элемента или атрибута в пространстве имен
 * мыслительных структур {@link XmlBrains#XMLNS_BRAINS}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public class BrainsКлюч extends ЗонныйКлюч
{
    
    public BrainsКлюч( String название ) 
    {
        super( название, XmlBrains.XMLNS_BRAINS );
    }
    
}
