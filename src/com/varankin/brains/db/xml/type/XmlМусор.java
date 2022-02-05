package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Хранилище удаленных элементов.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlМусор extends XmlАтрибутный
{
    АтрибутныйКлюч КЛЮЧ_Э_МУСОР = new АтрибутныйКлюч( 
        XML_BASKET, XMLNS_BRAINS ); //TODO XMLNS_BRAINS ?
}
