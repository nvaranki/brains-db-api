package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlМодуль extends XmlКоллективный, XmlФрагмент.Экземпляр
{
    BrainsКлюч КЛЮЧ_Э_МОДУЛЬ = new BrainsКлюч( XML_MODULE );
}
