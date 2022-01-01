package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор фрагмента мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlМодуль
{
    ЗонныйКлюч КЛЮЧ_Э_МОДУЛЬ = new ЗонныйКлюч( XML_MODULE, XMLNS_BRAINS );
}
