package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Хранилище удаленных элементов.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlМусор
{
    ЗонныйКлюч КЛЮЧ_Э_МУСОР = new ЗонныйКлюч( XML_BASKET, XMLNS_BRAINS ); //TODO XMLNS_BRAINS ?
}
