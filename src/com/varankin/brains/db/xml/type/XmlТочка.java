package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент схемы расчета.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlТочка extends XmlПараметризованный, XmlВнешний, XmlТиповой, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_ТОЧКА   = new BrainsКлюч( XML_POINT     );

    BrainsКлюч КЛЮЧ_А_ИНДЕКС  = new BrainsКлюч( XML_INDEX     );
    BrainsКлюч КЛЮЧ_А_ДАТЧИК  = new BrainsКлюч( XML_PROBE     );
    BrainsКлюч КЛЮЧ_А_ПОРОГ   = new BrainsКлюч( XML_THRESHOLD );
    BrainsКлюч КЛЮЧ_А_КОНТАКТ = new BrainsКлюч( XML_PIN       );
}
