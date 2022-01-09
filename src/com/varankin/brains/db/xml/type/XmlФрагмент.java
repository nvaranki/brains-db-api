package com.varankin.brains.db.xml.type;

//import com.varankin.brains.db.xml.ЗонныйКлюч;
import com.varankin.brains.db.xml.BrainsКлюч;
import static com.varankin.brains.db.xml.XmlBrains.*;

/**
 * XML-дескриптор: Фрагмент повторно используемой мыслительной структуры.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlФрагмент extends XmlТиповой, XmlПараметризованный, XmlКоммутируемый, XmlЭлемент
{
    BrainsКлюч КЛЮЧ_Э_ФРАГМЕНТ   = new BrainsКлюч( XML_FRAGMENT  );

    //ЗонныйКлюч КЛЮЧ_А_НАЗВАНИЕ = Типовой.КЛЮЧ_А_НАЗВАНИЕ; // дуальность названия
    
    BrainsКлюч КЛЮЧ_А_ПРОЦЕССОР  = new BrainsКлюч( XML_PROCESSOR );
    
    interface Экземпляр extends XmlКоммутируемый, XmlЭлемент {};
}
