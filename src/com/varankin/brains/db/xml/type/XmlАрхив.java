package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор архива.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlАрхив
{
    ЗонныйКлюч КЛЮЧ_Э_АРХИВ        = new ЗонныйКлюч( null,        XMLNS_BRAINS );
   
    ЗонныйКлюч КЛЮЧ_А_СОЗДАН       = new ЗонныйКлюч( XML_CREATED, XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_ИЗМЕНЕН      = new ЗонныйКлюч( XML_CHANGED, XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_РАСПОЛОЖЕНИЕ = new ЗонныйКлюч( XML_URI,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ     = XmlЭлемент.КЛЮЧ_А_НАЗВАНИЕ;
}
