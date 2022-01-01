package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор библиотеки.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlБиблиотека
{
    ЗонныйКлюч КЛЮЧ_Э_БИБЛИОТЕКА = new ЗонныйКлюч( XML_LIBRARY, XMLNS_BRAINS );
}
