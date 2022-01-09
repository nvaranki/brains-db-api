package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Вычислимый фрагмент мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlРасчет extends XmlФрагмент.Экземпляр
{
    BrainsКлюч КЛЮЧ_Э_РАСЧЕТ = new BrainsКлюч( XML_COMPUTE );
}
