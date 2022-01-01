package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент схемы расчета.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlТочка extends XmlТиповой
{
    ЗонныйКлюч КЛЮЧ_Э_ТОЧКА   = new ЗонныйКлюч( XML_POINT,     XMLNS_BRAINS );

    ЗонныйКлюч КЛЮЧ_А_ИНДЕКС  = new ЗонныйКлюч( XML_INDEX,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ДАТЧИК  = new ЗонныйКлюч( XML_PROBE,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ПОРОГ   = new ЗонныйКлюч( XML_THRESHOLD, XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_КОНТАКТ = new ЗонныйКлюч( XML_PIN,       XMLNS_BRAINS );
}
