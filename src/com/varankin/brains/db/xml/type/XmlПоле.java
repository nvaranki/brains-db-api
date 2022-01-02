package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Сенсорный фрагмент мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПоле extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_ПОЛЕ = new BrainsКлюч( XML_FIELD );
}
