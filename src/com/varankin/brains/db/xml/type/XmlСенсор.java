package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Сигнал, получаемый извне или формируемый собственным генератором.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlСенсор extends XmlПараметризованный, XmlВнешний, XmlТиповой, XmlЭлемент
{
    АтрибутныйКлюч КЛЮЧ_Э_СЕНСОР = new АтрибутныйКлюч( 
        XML_SENSOR, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ,
        КЛЮЧ_А_НАЗВАНИЕ_Т, КЛЮЧ_А_ССЫЛКА, КЛЮЧ_А_ВИД, КЛЮЧ_А_РЕАЛИЗАЦИЯ );
}
