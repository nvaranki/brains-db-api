package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Произвольный текст к фрагменту мыслительной структуры. 
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЗаметка
{
    BrainsКлюч КЛЮЧ_Э_ЗАМЕТКА = new BrainsКлюч( XML_NOTE );

    ЗонныйКлюч КЛЮЧ_А_ГЛУБИНА = new ЗонныйКлюч( BRAINS_ATTR_DETAIL, null );
}
