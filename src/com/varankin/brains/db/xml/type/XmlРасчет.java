package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор вычислимого фрагмента мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlРасчет
{
    ЗонныйКлюч КЛЮЧ_Э_РАСЧЕТ = new ЗонныйКлюч( XML_COMPUTE, XMLNS_BRAINS );
}
