package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент мыслительной структуры с памятью.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlЛента extends XmlФрагмент.Экземпляр
{
    АтрибутныйКлюч КЛЮЧ_Э_ЛЕНТА = new АтрибутныйКлюч( 
        XML_TIMELINE, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ );
}
