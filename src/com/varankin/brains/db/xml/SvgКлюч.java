package com.varankin.brains.db.xml;

import com.varankin.io.xml.svg.XmlSvg;

/**
 * Идентификатор элемента или атрибута в пространстве имен
 * 2-D графики типа Scalable Vector Graphics (SVG) {@link XmlSvg#XMLNS_SVG}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public class SvgКлюч extends ЗонныйКлюч
{
    
    public SvgКлюч( String название ) 
    {
        super( название, XmlSvg.XMLNS_SVG );
    }
    
}
