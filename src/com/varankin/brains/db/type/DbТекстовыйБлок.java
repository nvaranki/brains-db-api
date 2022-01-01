package com.varankin.brains.db.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Блок произвольного текста.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbТекстовыйБлок extends DbАтрибутный
{

    /**
     * @return содержимое текстового блока.
     */
    String текст();
    
    /**
     * @param значение содержимое текстового блока.
     */
    void текст( String значение );

    /**
     * @return позиция текстового блока.
     */
    Long строка();
    
    /**
     * @param значение позиция текстового блока.
     */
    void строка( Long значение );
    
    static String текст( Collection<? extends DbТекстовыйБлок> коллекция, String разделитель )
    {
        StringBuilder коды = new StringBuilder();
        ArrayList<? extends DbТекстовыйБлок> строки = new ArrayList<>( коллекция );
        Collections.sort( строки, Comparator.comparing( i -> 
        {
            Long строка = i.строка();
            return строка != null ? строка : 0L;
        } ) );
        for( DbТекстовыйБлок блок : строки )
        {
            String текст = блок.текст();
            if( текст != null && !текст.isEmpty() )
                коды.append( коды.length() == 0 ? "" : разделитель ).append( текст );
        }
        return коды.toString();
    }

}
