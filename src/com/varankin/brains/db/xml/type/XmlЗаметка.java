package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор заметки.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЗаметка
{
    ЗонныйКлюч КЛЮЧ_Э_ЗАМЕТКА = new ЗонныйКлюч( XML_NOTE, XMLNS_BRAINS );

    ЗонныйКлюч КЛЮЧ_А_ГЛУБИНА = new ЗонныйКлюч( BRAINS_ATTR_DETAIL, null );
}
