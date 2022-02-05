package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.Xml;

/**
 * XML-дескриптор: Блок произвольного текста.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlТекстовыйБлок extends XmlАтрибутный
{
    ЗонныйКлюч КЛЮЧ_А_ТЕКСТ   = new ЗонныйКлюч( Xml.XML_TEXT,  null );
    ЗонныйКлюч КЛЮЧ_А_СТРОКА  = new ЗонныйКлюч( Xml.XML_LINE,  null );

    АтрибутныйКлюч КЛЮЧ_Э_Т_БЛОК = new АтрибутныйКлюч( 
        Xml.XML_CDATA, null,
        КЛЮЧ_А_ТЕКСТ, КЛЮЧ_А_СТРОКА );
}
