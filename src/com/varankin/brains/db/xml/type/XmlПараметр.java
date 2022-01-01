package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор параметра настройки экземпляра {@linkplain Object объекта}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПараметр
{
    ЗонныйКлюч КЛЮЧ_Э_ПАРАМЕТР  = new ЗонныйКлюч( XML_PARAMETER, XMLNS_BRAINS );

    ЗонныйКлюч КЛЮЧ_А_ИНДЕКС    = new ЗонныйКлюч( XML_INDEX,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ПРИОРИТЕТ = new ЗонныйКлюч( XML_PRIORITY,  XMLNS_BRAINS );
}
