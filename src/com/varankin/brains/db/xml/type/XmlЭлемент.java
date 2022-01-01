package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.ЗонныйКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор контакта.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЭлемент
{
    ЗонныйКлюч КЛЮЧ_Э_ЭЛЕМЕНТ   = new ЗонныйКлюч( null, XMLNS_BRAINS ); //TODO why?

    ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ = new ЗонныйКлюч( BRAINS_ATTR_NAME,     XMLNS_BRAINS );
    ЗонныйКлюч КЛЮЧ_А_СБОРКИ   = new ЗонныйКлюч( BRAINS_ATTR_ASSEMBLY, XMLNS_BRAINS );
}
