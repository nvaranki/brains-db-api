package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент мыслительной структуры.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlМодуль extends XmlКоллективный, XmlФрагмент.Экземпляр
{
    АтрибутныйКлюч КЛЮЧ_Э_МОДУЛЬ = new АтрибутныйКлюч( 
        XML_MODULE, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ );
}
