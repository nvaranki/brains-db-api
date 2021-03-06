package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор архива.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlАрхив extends XmlАтрибутный
{
    BrainsКлюч КЛЮЧ_А_СОЗДАН       = new BrainsКлюч( XML_CREATED );
    BrainsКлюч КЛЮЧ_А_ИЗМЕНЕН      = new BrainsКлюч( XML_CHANGED );
    BrainsКлюч КЛЮЧ_А_РАСПОЛОЖЕНИЕ = new BrainsКлюч( XML_URI     );
    
    ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ     = XmlЭлемент.КЛЮЧ_А_НАЗВАНИЕ;
   
    АтрибутныйКлюч КЛЮЧ_Э_АРХИВ    = new АтрибутныйКлюч( 
        XML_ARHIVE, null,
        КЛЮЧ_А_НАЗВАНИЕ, 
        КЛЮЧ_А_СОЗДАН, КЛЮЧ_А_ИЗМЕНЕН /*TODO , КЛЮЧ_А_РАСПОЛОЖЕНИЕ*/ );
}
