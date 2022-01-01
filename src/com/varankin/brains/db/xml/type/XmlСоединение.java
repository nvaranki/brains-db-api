package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Блок контактов фрагмента мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlСоединение
{
    ЗонныйКлюч КЛЮЧ_Э_СОЕДИНЕНИЕ  = new ЗонныйКлюч( XML_JOINT, XMLNS_BRAINS );
}
