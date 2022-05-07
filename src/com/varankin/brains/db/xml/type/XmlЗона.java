package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import com.varankin.brains.db.xml.Xml;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Расширенное название пространства имен XML.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlЗона extends XmlАтрибутный
{
    BrainsКлюч КЛЮЧ_А_ВАРИАНТЫ = new BrainsКлюч( XML_NAME      ); //TODO XML_NAME ?!
    BrainsКлюч КЛЮЧ_А_ЗОНА     = new BrainsКлюч( Xml.XML_XMLNS );
    
    АтрибутныйКлюч КЛЮЧ_Э_ЗОНА = new АтрибутныйКлюч( 
        Xml.XMLNS_NS, null /*TODO зацикливается Xml.XMLNS_XML*/,
        КЛЮЧ_А_ВАРИАНТЫ, КЛЮЧ_А_ЗОНА );
}
