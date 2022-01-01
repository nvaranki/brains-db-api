package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор пакета из проектов и библиотек мыслительных структур.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПакет
{
    ЗонныйКлюч КЛЮЧ_Э_ПАКЕТ    = new ЗонныйКлюч( XML_BRAINS,  XMLNS_BRAINS );

    ЗонныйКлюч КЛЮЧ_А_ВЕРСИЯ   = new ЗонныйКлюч( XML_VERSION, XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ = new ЗонныйКлюч( XML_NAME,    XMLNS_BRAINS );
}
