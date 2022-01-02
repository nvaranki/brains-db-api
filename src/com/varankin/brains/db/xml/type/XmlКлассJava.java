package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Код на языке программирования Java.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlКлассJava extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_JAVA       = new BrainsКлюч( XML_JAVA            );

    BrainsКлюч КЛЮЧ_А_КЛАСС      = new BrainsКлюч( BRAINS_ATTR_NAME    ); //TODO разделить с названием элемента? cref vs name
    BrainsКлюч КЛЮЧ_А_НАЗНАЧЕНИЕ = new BrainsКлюч( BRAINS_ATTR_PURPOSE );
}
