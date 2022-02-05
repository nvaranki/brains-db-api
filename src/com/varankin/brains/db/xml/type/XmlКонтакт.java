package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент {@linkplain DbСоединение соединения} 
 * для приема-передачи одного {@link DbСигнал сигнала}.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlКонтакт extends XmlВнешний, XmlПараметризованный, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_А_ПРИОРИТЕТ = new BrainsКлюч( XML_PRIORITY );
    BrainsКлюч КЛЮЧ_А_СВОЙСТВА  = new BrainsКлюч( XML_TYPE     );
    BrainsКлюч КЛЮЧ_А_СИГНАЛ    = new BrainsКлюч( XML_SIGNAL   );
    BrainsКлюч КЛЮЧ_А_ТОЧКА     = new BrainsКлюч( XML_POINT    );

    АтрибутныйКлюч КЛЮЧ_Э_КОНТАКТ = new АтрибутныйКлюч( 
        XML_PIN, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ,
        КЛЮЧ_А_ПРИОРИТЕТ, КЛЮЧ_А_СВОЙСТВА, КЛЮЧ_А_СИГНАЛ, КЛЮЧ_А_ТОЧКА );
}
