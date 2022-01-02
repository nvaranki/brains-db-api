package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Блок контактов фрагмента мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlСоединение extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_СОЕДИНЕНИЕ  = new BrainsКлюч( XML_JOINT );
}
