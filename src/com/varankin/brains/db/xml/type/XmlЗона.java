package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.Xml;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор пространства имен.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЗона
{
    ЗонныйКлюч КЛЮЧ_Э_ЗОНА     = new ЗонныйКлюч( null, null );
    
    ЗонныйКлюч КЛЮЧ_А_ВАРИАНТЫ = new ЗонныйКлюч( XML_NAME, XMLNS_BRAINS ); //TODO XML_NAME ?!
    ЗонныйКлюч КЛЮЧ_А_ЗОНА     = new ЗонныйКлюч( Xml.XML_XMLNS, XMLNS_BRAINS );
}
