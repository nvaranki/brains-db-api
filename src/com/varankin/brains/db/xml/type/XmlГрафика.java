package com.varankin.brains.db.xml.type;

import com.varankin.brains.db.xml.АтрибутныйКлюч;
import com.varankin.io.xml.svg.XmlSvg;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * XML-дескриптор: Произвольный узел структуры данных,
 * предназначенный для визуального отображения.
 * 
 * @author &copy; 2022 Николай Варанкин
 */
public interface XmlГрафика extends XmlТиповой, XmlУзел
{
    static Map<String,АтрибутныйКлюч> КЛЮЧ_Э_ГРАФИКА = 
        Collections.synchronizedMap( Collections.unmodifiableMap( new HashMap<>() 
    {
        @Override
        public АтрибутныйКлюч get( Object key )
        {
            return key instanceof String ? 
                computeIfAbsent( (String) key, k -> new АтрибутныйКлюч( 
                        (String) key, XmlSvg.XMLNS_SVG, new HashSet<>() ) ) :
                super.get( key );
        }
    } ) );
    
}
