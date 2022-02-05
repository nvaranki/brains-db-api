package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Сенсорный фрагмент мыслительной структуры.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlПоле extends XmlФрагмент.Экземпляр
{
    АтрибутныйКлюч КЛЮЧ_Э_ПОЛЕ = new АтрибутныйКлюч( 
        XML_FIELD, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ );
}
