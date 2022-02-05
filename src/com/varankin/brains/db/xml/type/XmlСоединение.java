package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Блок контактов фрагмента мыслительной структуры.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlСоединение extends XmlЭлемент
{
    АтрибутныйКлюч КЛЮЧ_Э_СОЕДИНЕНИЕ = new АтрибутныйКлюч( 
        XML_JOINT, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ );
}
