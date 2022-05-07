package com.varankin.brains.db.xml;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

/**
 * Идентификатор элемента и его атрибутов.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public class АтрибутныйКлюч extends ЗонныйКлюч
{
    public final Collection<ЗонныйКлюч> АТРИБУТЫ;
    private int hash;
    
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

    @Override
    public int hashCode() 
    {
        if( hash == 0 )
        {
            hash = super.hashCode();
            hash = 29 * hash + Objects.hashCode( АТРИБУТЫ );
        }
        return hash;
    }

    @Override
    public boolean equals( Object test )
    {
        return 
            test instanceof АтрибутныйКлюч &&
            super.equals( test ) && 
            ( (АтрибутныйКлюч)test ).АТРИБУТЫ.equals( АТРИБУТЫ );
    }
    
}
