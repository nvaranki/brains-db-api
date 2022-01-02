package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Мыслительная структура.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПроект extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_ПРОЕКТ = new BrainsКлюч( XML_PROJECT );
}
