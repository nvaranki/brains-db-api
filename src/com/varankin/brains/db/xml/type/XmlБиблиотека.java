package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Набор произвольных модулей, функций, 
 * классов и процессоров мыслительной структуры.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlБиблиотека extends XmlЭлемент
{
    АтрибутныйКлюч КЛЮЧ_Э_БИБЛИОТЕКА = new АтрибутныйКлюч( 
        XML_LIBRARY, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ );
}
