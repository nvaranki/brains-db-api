package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор сенсорного фрагмента мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlПоле
{
    ЗонныйКлюч КЛЮЧ_Э_ПОЛЕ = new ЗонныйКлюч( XML_FIELD, XMLNS_BRAINS );
}
