package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор контакта.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlКонтакт extends XmlЭлемент
{
    ЗонныйКлюч КЛЮЧ_Э_КОНТАКТ   = new ЗонныйКлюч( XML_PIN, XMLNS_BRAINS );

    ЗонныйКлюч КЛЮЧ_А_ПРИОРИТЕТ = new ЗонныйКлюч( XML_PRIORITY, XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_СВОЙСТВА  = new ЗонныйКлюч( XML_TYPE,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_СИГНАЛ    = new ЗонныйКлюч( XML_SIGNAL,   XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ТОЧКА     = new ЗонныйКлюч( XML_POINT,    XMLNS_BRAINS );
}
