package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент {@linkplain DbСоединение соединения} 
 * для приема-передачи одного {@link DbСигнал сигнала}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlКонтакт extends XmlВнешний, XmlПараметризованный, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_КОНТАКТ   = new BrainsКлюч( XML_PIN      );

    BrainsКлюч КЛЮЧ_А_ПРИОРИТЕТ = new BrainsКлюч( XML_PRIORITY );
    BrainsКлюч КЛЮЧ_А_СВОЙСТВА  = new BrainsКлюч( XML_TYPE     );
    BrainsКлюч КЛЮЧ_А_СИГНАЛ    = new BrainsКлюч( XML_SIGNAL   );
    BrainsКлюч КЛЮЧ_А_ТОЧКА     = new BrainsКлюч( XML_POINT    );
}
