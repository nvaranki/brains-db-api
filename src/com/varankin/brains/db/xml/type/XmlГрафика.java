package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.SvgКлюч;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * XML-дескриптор: Произвольный узел структуры данных,
 * предназначенный для визуального отображения.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface XmlГрафика extends XmlТиповой, XmlУзел
{
    static Map<String,SvgКлюч> КЛЮЧ_Э_ГРАФИКА = 
        Collections.synchronizedMap( Collections.unmodifiableMap( new HashMap<>() 
    {
        @Override
        public SvgКлюч get( Object key )
        {
            return key instanceof String ? 
                computeIfAbsent( (String) key, SvgКлюч::new ) :
                super.get( key );
            
        }
    } ) );
    
}
