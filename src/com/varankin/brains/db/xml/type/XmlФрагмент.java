package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
//import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент повторно используемой мыслительной структуры.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlФрагмент extends XmlТиповой, XmlПараметризованный, XmlКоммутируемый, XmlЭлемент
{
//  ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ   = Типовой.КЛЮЧ_А_НАЗВАНИЕ; // дуальность названия
    BrainsКлюч КЛЮЧ_А_ПРОЦЕССОР  = new BrainsКлюч( XML_PROCESSOR );
    
    АтрибутныйКлюч КЛЮЧ_Э_ФРАГМЕНТ = new АтрибутныйКлюч( 
        XML_FRAGMENT, XMLNS_BRAINS,
        КЛЮЧ_А_НАЗВАНИЕ, КЛЮЧ_А_СБОРКИ,
        КЛЮЧ_А_НАЗВАНИЕ_Т, КЛЮЧ_А_ССЫЛКА, КЛЮЧ_А_ВИД, КЛЮЧ_А_РЕАЛИЗАЦИЯ,
        КЛЮЧ_А_ПРОЦЕССОР );

    interface Экземпляр extends XmlКоммутируемый, XmlЭлемент {};
}
