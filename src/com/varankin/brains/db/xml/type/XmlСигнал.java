package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Сигнал, формируемый по результату расчета когнитивной функции.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlСигнал extends XmlЭлемент
{
    BrainsКлюч КЛЮЧ_А_ПРИОРИТЕТ = new BrainsКлюч( XML_PRIORITY );
        
    АтрибутныйКлюч КЛЮЧ_Э_СИГНАЛ = new АтрибутныйКлюч( 
        XML_SIGNAL, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ, 
        КЛЮЧ_А_ПРИОРИТЕТ );
}
