package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Пакет из проектов и библиотек мыслительных структур.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlПакет extends XmlУзел
{
    BrainsКлюч КЛЮЧ_А_ВЕРСИЯ   = new BrainsКлюч( XML_VERSION );
    BrainsКлюч КЛЮЧ_А_НАЗВАНИЕ = new BrainsКлюч( XML_NAME    );

    АтрибутныйКлюч КЛЮЧ_Э_ПАКЕТ = new АтрибутныйКлюч( 
        XML_BRAINS, XMLNS_BRAINS,
        КЛЮЧ_А_ВЕРСИЯ, КЛЮЧ_А_НАЗВАНИЕ );
}
