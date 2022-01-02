package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Параметр настройки экземпляра {@linkplain Object объекта}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПараметр extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_ПАРАМЕТР  = new BrainsКлюч( XML_PARAMETER );

    BrainsКлюч КЛЮЧ_А_ИНДЕКС    = new BrainsКлюч( XML_INDEX     );
    BrainsКлюч КЛЮЧ_А_ПРИОРИТЕТ = new BrainsКлюч( XML_PRIORITY  );
}
