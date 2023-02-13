package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Код на языке программирования Java.
 *
 * @author &copy; 2023 Николай Варанкин
 */
public interface XmlКлассJava extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_А_КЛАСС      = new BrainsКлюч( BRAINS_ATTR_NAME    ); //TODO разделить с названием элемента? cref vs name
    BrainsКлюч КЛЮЧ_А_НАЗНАЧЕНИЕ = new BrainsКлюч( BRAINS_ATTR_PURPOSE );
    BrainsКлюч КЛЮЧ_А_ОПЦИИ      = new BrainsКлюч( BRAINS_ATTR_OPTIONS );

    АтрибутныйКлюч КЛЮЧ_Э_JAVA   = new АтрибутныйКлюч( 
        XML_JAVA, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ,
        КЛЮЧ_А_КЛАСС, КЛЮЧ_А_НАЗНАЧЕНИЕ, КЛЮЧ_А_ОПЦИИ );
}
