package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент схемы расчета.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlТочка extends XmlПараметризованный, XmlВнешний, XmlТиповой, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_А_ИНДЕКС  = new BrainsКлюч( XML_INDEX     );
    BrainsКлюч КЛЮЧ_А_ДАТЧИК  = new BrainsКлюч( XML_PROBE     );
    BrainsКлюч КЛЮЧ_А_ПОРОГ   = new BrainsКлюч( XML_THRESHOLD );
    BrainsКлюч КЛЮЧ_А_КОНТАКТ = new BrainsКлюч( XML_PIN       );

    АтрибутныйКлюч КЛЮЧ_Э_ТОЧКА = new АтрибутныйКлюч( 
        XML_POINT, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ,
        КЛЮЧ_А_НАЗВАНИЕ_Т, КЛЮЧ_А_ССЫЛКА, КЛЮЧ_А_ВИД, КЛЮЧ_А_РЕАЛИЗАЦИЯ,
        КЛЮЧ_А_ИНДЕКС, КЛЮЧ_А_ДАТЧИК, КЛЮЧ_А_ПОРОГ, КЛЮЧ_А_КОНТАКТ );
}
