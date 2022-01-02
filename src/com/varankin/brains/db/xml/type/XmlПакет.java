package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Пакет из проектов и библиотек мыслительных структур.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПакет
{
    BrainsКлюч КЛЮЧ_Э_ПАКЕТ    = new BrainsКлюч( XML_BRAINS );

    BrainsКлюч КЛЮЧ_А_ВЕРСИЯ   = new BrainsКлюч( XML_VERSION );
    BrainsКлюч КЛЮЧ_А_НАЗВАНИЕ = new BrainsКлюч( XML_NAME    );
}
