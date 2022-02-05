package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Мыслительная структура.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlПроект extends XmlКоллективный, XmlЭлемент
{
    АтрибутныйКлюч КЛЮЧ_Э_ПРОЕКТ = new АтрибутныйКлюч( 
        XML_PROJECT, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ );
}
