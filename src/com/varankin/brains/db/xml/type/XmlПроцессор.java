package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Активный элемент мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПроцессор extends XmlПараметризованный, XmlВнешний, XmlТиповой, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_ПРОЦЕССОР  = new BrainsКлюч( XML_PROCESSOR );
    
    BrainsКлюч КЛЮЧ_А_СТРАТЕГИЯ  = new BrainsКлюч( XML_STRATEGY  );
    BrainsКлюч КЛЮЧ_А_ОЧИСТКА    = new BrainsКлюч( XML_PURGE     );
    BrainsКлюч КЛЮЧ_А_СЖАТИЕ     = new BrainsКлюч( XML_COLLAPSE  );
    BrainsКлюч КЛЮЧ_А_РЕСТАРТ    = new BrainsКлюч( XML_RESTART   );
    BrainsКлюч КЛЮЧ_А_ПАУЗА      = new BrainsКлюч( XML_PAUSE     );
    BrainsКлюч КЛЮЧ_А_НАКОПЛЕНИЕ = new BrainsКлюч( XML_INLINE    );
    BrainsКлюч КЛЮЧ_А_ЗАДЕРЖКА   = new BrainsКлюч( XML_DELAY     );
}
