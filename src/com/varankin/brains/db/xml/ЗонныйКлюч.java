package com.varankin.brains.db.xml;

import java.util.Objects;

/**
 * Идентификатор элемента или атрибута в пространстве имен.
 *
 * @author &copy; 2022 Николай Варанкин
 */
public class ЗонныйКлюч
{
    public final String НАЗВАНИЕ;
    public final String ЗОНА;
    private int hash;

    public ЗонныйКлюч( String название, String зона ) 
    {
        НАЗВАНИЕ = название;
        ЗОНА = зона;
    }

    @Override
    public int hashCode()
    {
        if( hash == 0 )
        {
            hash = Objects.hashCode( ЗонныйКлюч.class.getName() );
            hash = 17 * hash + Objects.hashCode( НАЗВАНИЕ );
            hash = 17 * hash + Objects.hashCode( ЗОНА  );
        }
        return hash;
    }

    @Override
    public boolean equals( Object test )
    {
        if( test instanceof ЗонныйКлюч )
        {
            final ЗонныйКлюч ключ = (ЗонныйКлюч) test;
            if( !Objects.equals( this.НАЗВАНИЕ, ключ.НАЗВАНИЕ ) ) return false;
            if( !Objects.equals( this.ЗОНА,     ключ.ЗОНА     ) ) return false;
            return true;
        }
        else    
            return false;
    }

}    
