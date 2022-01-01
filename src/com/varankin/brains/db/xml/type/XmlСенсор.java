package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор сигнала, формируемого по результату расчета когнитивной функции.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlСенсор extends XmlТиповой
{
    ЗонныйКлюч КЛЮЧ_Э_СЕНСОР = new ЗонныйКлюч( XML_SIGNAL, XMLNS_BRAINS );
    
}
