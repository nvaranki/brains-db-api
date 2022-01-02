package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Сигнал, получаемый извне или формируемый собственным генератором.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlСенсор extends XmlТиповой, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_СЕНСОР = new BrainsКлюч( XML_SIGNAL );
    
}
