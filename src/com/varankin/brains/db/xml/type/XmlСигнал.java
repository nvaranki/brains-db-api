package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Сигнал, формируемый по результату расчета когнитивной функции.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlСигнал extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_СИГНАЛ    = new BrainsКлюч( XML_SIGNAL   );
        
    BrainsКлюч КЛЮЧ_А_ПРИОРИТЕТ = new BrainsКлюч( XML_PRIORITY );
}
