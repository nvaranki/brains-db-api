package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Вычислимый фрагмент мыслительной структуры.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlРасчет extends XmlФрагмент.Экземпляр
{
    АтрибутныйКлюч КЛЮЧ_Э_РАСЧЕТ = new АтрибутныйКлюч( 
        XML_COMPUTE, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ );
}
