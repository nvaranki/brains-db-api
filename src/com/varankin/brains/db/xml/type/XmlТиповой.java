package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.XLink;
import com.varankin.brains.db.xml.ЗонныйКлюч;

/**
 * XML-дескриптор типовых элементов.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlТиповой extends XLink
{
    ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ_Т = new ЗонныйКлюч( XLINK_TITLE,   XMLNS_XLINK );
    ЗонныйКлюч КЛЮЧ_А_ССЫЛКА     = new ЗонныйКлюч( XLINK_HREF,    XMLNS_XLINK );
    ЗонныйКлюч КЛЮЧ_А_ВИД        = new ЗонныйКлюч( XLINK_SHOW,    XMLNS_XLINK );
    ЗонныйКлюч КЛЮЧ_А_РЕАЛИЗАЦИЯ = new ЗонныйКлюч( XLINK_ACTUATE, XMLNS_XLINK );
}
