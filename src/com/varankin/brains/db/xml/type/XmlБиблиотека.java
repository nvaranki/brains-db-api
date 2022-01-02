package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Набор произвольных модулей, функций, 
 * классов и процессоров мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlБиблиотека extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_БИБЛИОТЕКА = new BrainsКлюч( XML_LIBRARY );
}
