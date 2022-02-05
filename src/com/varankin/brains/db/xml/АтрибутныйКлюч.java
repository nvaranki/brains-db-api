package com.varankin.brains.db.xml;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Идентификатор элемента и его атрибутов.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public class АтрибутныйКлюч extends ЗонныйКлюч
{
    public final Collection<ЗонныйКлюч> АТРИБУТЫ;
    
    public АтрибутныйКлюч( String название, String зона, ЗонныйКлюч... атрибуты ) 
    {
        this( название, зона, атрибуты.length == 0 ? Collections.EMPTY_LIST :
            Collections.unmodifiableCollection( Arrays.asList( атрибуты ) ) );
    }
    
    public АтрибутныйКлюч( String название, String зона, Collection<ЗонныйКлюч> атрибуты ) 
    {
        super( название, зона );
        АТРИБУТЫ = атрибуты;
    }
    
}
