package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Активный элемент мыслительной структуры.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlПроцессор 
        extends XmlПараметризованный, XmlВнешний, XmlТиповой, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_А_СТРАТЕГИЯ  = new BrainsКлюч( XML_STRATEGY  );
    BrainsКлюч КЛЮЧ_А_ОЧИСТКА    = new BrainsКлюч( XML_PURGE     );
    BrainsКлюч КЛЮЧ_А_СЖАТИЕ     = new BrainsКлюч( XML_COLLAPSE  );
    BrainsКлюч КЛЮЧ_А_РЕСТАРТ    = new BrainsКлюч( XML_RESTART   );
    BrainsКлюч КЛЮЧ_А_ПАУЗА      = new BrainsКлюч( XML_PAUSE     );
    BrainsКлюч КЛЮЧ_А_НАКОПЛЕНИЕ = new BrainsКлюч( XML_INLINE    );
    BrainsКлюч КЛЮЧ_А_ЗАДЕРЖКА   = new BrainsКлюч( XML_DELAY     );
    
    АтрибутныйКлюч КЛЮЧ_Э_ПРОЦЕССОР  = new АтрибутныйКлюч( 
        XML_PROCESSOR, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ,
        КЛЮЧ_А_НАЗВАНИЕ_Т, КЛЮЧ_А_ССЫЛКА, КЛЮЧ_А_ВИД, КЛЮЧ_А_РЕАЛИЗАЦИЯ,
        КЛЮЧ_А_СТРАТЕГИЯ, КЛЮЧ_А_ОЧИСТКА, КЛЮЧ_А_СЖАТИЕ,
        КЛЮЧ_А_РЕСТАРТ, КЛЮЧ_А_ПАУЗА, КЛЮЧ_А_НАКОПЛЕНИЕ, 
        КЛЮЧ_А_ЗАДЕРЖКА );
}
