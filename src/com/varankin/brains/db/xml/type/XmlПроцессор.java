package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор активного элемента мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПроцессор extends XmlТиповой
{
    ЗонныйКлюч КЛЮЧ_Э_ПРОЦЕССОР  = new ЗонныйКлюч( XML_PROCESSOR, XMLNS_BRAINS );
    
    ЗонныйКлюч КЛЮЧ_А_СТРАТЕГИЯ  = new ЗонныйКлюч( XML_STRATEGY,  XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ОЧИСТКА    = new ЗонныйКлюч( XML_PURGE,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_СЖАТИЕ     = new ЗонныйКлюч( XML_COLLAPSE,  XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_РЕСТАРТ    = new ЗонныйКлюч( XML_RESTART,   XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ПАУЗА      = new ЗонныйКлюч( XML_PAUSE,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_НАКОПЛЕНИЕ = new ЗонныйКлюч( XML_INLINE,    XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ЗАДЕРЖКА   = new ЗонныйКлюч( XML_DELAY,     XMLNS_BRAINS );
}
