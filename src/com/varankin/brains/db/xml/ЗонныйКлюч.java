package com.varankin.brains.db.xml;

import java.util.Objects;

/**
 * Идентификатор элемента или атрибута в пространстве имен.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public class ЗонныйКлюч
{
    public final String НАЗВАНИЕ;
    public final String ЗОНА;

    public ЗонныйКлюч( String название, String зона ) 
    {
        НАЗВАНИЕ = название;
        ЗОНА = зона;
    }

    @Override
    public int hashCode()
    {
        int hash = Objects.hashCode(ЗонныйКлюч.class.getName() );
        hash = 17 * hash + Objects.hashCode( НАЗВАНИЕ );
        hash = 17 * hash + Objects.hashCode( ЗОНА  );
        return hash;
    }

    @Override
    public boolean equals( Object test )
    {
        if( this == test ) return true;
        if( test == null ) return false;
        if( getClass() != test.getClass() ) return false;
        final ЗонныйКлюч ключ = (ЗонныйКлюч) test;
        if( !Objects.equals( this.НАЗВАНИЕ, ключ.НАЗВАНИЕ ) ) return false;
        if( !Objects.equals( this.ЗОНА,     ключ.ЗОНА     ) ) return false;
        return true;
    }

}    
