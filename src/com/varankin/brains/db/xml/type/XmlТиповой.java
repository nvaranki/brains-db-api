package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.XLinkКлюч;
import com.varankin.brains.db.xml.ЗонныйКлюч;

import static com.varankin.brains.db.xml.XLink.*;

/**
 * XML-дескриптор типовых элементов.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlТиповой
{
    ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ_Т = new XLinkКлюч( XLINK_TITLE   );
    ЗонныйКлюч КЛЮЧ_А_ССЫЛКА     = new XLinkКлюч( XLINK_HREF    );
    ЗонныйКлюч КЛЮЧ_А_ВИД        = new XLinkКлюч( XLINK_SHOW    );
    ЗонныйКлюч КЛЮЧ_А_РЕАЛИЗАЦИЯ = new XLinkКлюч( XLINK_ACTUATE );
}
