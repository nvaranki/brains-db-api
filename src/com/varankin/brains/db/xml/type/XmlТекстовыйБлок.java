package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.Xml;

/**
 * XML-дескриптор: Блок произвольного текста.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlТекстовыйБлок extends XmlАтрибутный
{
    ЗонныйКлюч КЛЮЧ_Э_Т_БЛОК  = new ЗонныйКлюч( Xml.XML_CDATA, null );

    ЗонныйКлюч КЛЮЧ_А_ТЕКСТ   = new ЗонныйКлюч( Xml.XML_TEXT,  null );
    ЗонныйКлюч КЛЮЧ_А_СТРОКА  = new ЗонныйКлюч( Xml.XML_LINE,  null );
}
