package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор сигнала, формируемого по результату расчета когнитивной функции.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlСигнал
{
    ЗонныйКлюч КЛЮЧ_Э_СИГНАЛ    = new ЗонныйКлюч( XML_SIGNAL,   XMLNS_BRAINS );
        
    ЗонныйКлюч КЛЮЧ_А_ПРИОРИТЕТ = new ЗонныйКлюч( XML_PRIORITY, XMLNS_BRAINS );
}
