package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор архива.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlАрхив
{
    BrainsКлюч КЛЮЧ_Э_АРХИВ        = new BrainsКлюч( null        );
   
    BrainsКлюч КЛЮЧ_А_СОЗДАН       = new BrainsКлюч( XML_CREATED );
    BrainsКлюч КЛЮЧ_А_ИЗМЕНЕН      = new BrainsКлюч( XML_CHANGED );
    BrainsКлюч КЛЮЧ_А_РАСПОЛОЖЕНИЕ = new BrainsКлюч( XML_URI     );
    
    ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ     = XmlЭлемент.КЛЮЧ_А_НАЗВАНИЕ;
}
