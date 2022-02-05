package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Произвольный текст к фрагменту мыслительной структуры. 
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlЗаметка extends XmlУзел
{
    BrainsКлюч КЛЮЧ_А_ГЛУБИНА = new BrainsКлюч( BRAINS_ATTR_DETAIL );

    АтрибутныйКлюч КЛЮЧ_Э_ЗАМЕТКА = new АтрибутныйКлюч( 
        XML_NOTE, XMLNS_BRAINS, 
        КЛЮЧ_А_ГЛУБИНА );
}
