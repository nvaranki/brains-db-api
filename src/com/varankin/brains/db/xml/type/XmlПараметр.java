package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Параметр настройки экземпляра {@linkplain Object объекта}.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlПараметр extends XmlПараметризованный, XmlВнешний, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_А_ИНДЕКС    = new BrainsКлюч( XML_INDEX     );
    BrainsКлюч КЛЮЧ_А_ПРИОРИТЕТ = new BrainsКлюч( XML_PRIORITY  );

    АтрибутныйКлюч КЛЮЧ_Э_ПАРАМЕТР = new АтрибутныйКлюч( 
        XML_PARAMETER, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ,
        КЛЮЧ_А_ИНДЕКС, КЛЮЧ_А_ПРИОРИТЕТ );
}
