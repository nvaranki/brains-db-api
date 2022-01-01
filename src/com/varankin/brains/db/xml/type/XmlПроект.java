package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПроект
{
    ЗонныйКлюч КЛЮЧ_Э_ПРОЕКТ = new ЗонныйКлюч( XML_PROJECT, XMLNS_BRAINS );
}
