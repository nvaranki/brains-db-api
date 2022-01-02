package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import com.varankin.brains.db.xml.Xml;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Расширенное название пространства имен XML.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЗона
{
    ЗонныйКлюч КЛЮЧ_Э_ЗОНА     = new ЗонныйКлюч( null, null );
    
    BrainsКлюч КЛЮЧ_А_ВАРИАНТЫ = new BrainsКлюч( XML_NAME      ); //TODO XML_NAME ?!
    BrainsКлюч КЛЮЧ_А_ЗОНА     = new BrainsКлюч( Xml.XML_XMLNS );
}
