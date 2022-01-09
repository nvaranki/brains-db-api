package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.Xml;

/**
 * XML-дескриптор: Инструкция для обработки.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlИнструкция extends XmlАтрибутный
{
    ЗонныйКлюч КЛЮЧ_Э_ИНСТРУКЦИЯ = new ЗонныйКлюч( Xml.PI_ELEMENT, null );

    ЗонныйКлюч КЛЮЧ_А_КОД        = new ЗонныйКлюч( Xml.PI_ATTR_INSTRUCTION, null );
    ЗонныйКлюч КЛЮЧ_А_ПРОЦЕССОР  = new ЗонныйКлюч( Xml.PI_ATTR_TARGET,      null );
}
