package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор фрагмента мыслительной структуры с памятью.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЛента
{
    ЗонныйКлюч КЛЮЧ_Э_ЛЕНТА = new ЗонныйКлюч( XML_TIMELINE, XMLNS_BRAINS );
}
