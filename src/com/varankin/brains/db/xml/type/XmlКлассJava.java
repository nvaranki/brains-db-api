package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор кода на языке программирования Java.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlКлассJava extends XmlЭлемент
{
    ЗонныйКлюч КЛЮЧ_Э_JAVA       = new ЗонныйКлюч( XML_JAVA, XMLNS_BRAINS );

    ЗонныйКлюч КЛЮЧ_А_КЛАСС      = new ЗонныйКлюч( BRAINS_ATTR_NAME, XMLNS_BRAINS ); //TODO разделить с названием элемента? cref vs name
    ЗонныйКлюч КЛЮЧ_А_НАЗНАЧЕНИЕ = new ЗонныйКлюч( BRAINS_ATTR_PURPOSE, XMLNS_BRAINS );
}
