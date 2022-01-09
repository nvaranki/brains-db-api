package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Основа элемента мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlЭлемент extends XmlУзел
{
    BrainsКлюч КЛЮЧ_Э_ЭЛЕМЕНТ   = new BrainsКлюч( null                 ); //TODO why? duplicated!!!

    BrainsКлюч КЛЮЧ_А_НАЗВАНИЕ  = new BrainsКлюч( BRAINS_ATTR_NAME     );
    BrainsКлюч КЛЮЧ_А_СБОРКИ    = new BrainsКлюч( BRAINS_ATTR_ASSEMBLY );
}
