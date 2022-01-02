package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент мыслительной структуры с памятью.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЛента extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_ЛЕНТА = new BrainsКлюч( XML_TIMELINE );
}
