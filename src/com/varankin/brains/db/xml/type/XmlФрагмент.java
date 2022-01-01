package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент повторно используемой мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlФрагмент extends XmlТиповой
{
    ЗонныйКлюч КЛЮЧ_Э_ФРАГМЕНТ   = new ЗонныйКлюч( XML_FRAGMENT,  XMLNS_BRAINS );

    //ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ = Типовой.КЛЮЧ_А_НАЗВАНИЕ; // дуальность названия
    ЗонныйКлюч КЛЮЧ_А_ПРОЦЕССОР  = new ЗонныйКлюч( XML_PROCESSOR, XMLNS_BRAINS );
}
