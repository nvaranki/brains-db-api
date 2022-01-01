package com.varankin.brains.db.xml;

/**
 * Описание типа узла или его атрибута с привязкой к пространству имен.
 * Служит как полный идентификатор XML элемента или атрибута.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public class МаркированныйЗонныйКлюч extends ЗонныйКлюч
{
    public final String PREFIX;

    public МаркированныйЗонныйКлюч( String name, String uri, String prefix ) 
    {
        super( name, uri );
        PREFIX = prefix;
    }

    /**
     * @return название типа объекта.
     */
    public final String название() { return НАЗВАНИЕ; }

    /**
     * @return универсальный идентификатор пространства имен (URI).
     */
    public final String uri() { return ЗОНА; }

    /**
     * @return приставка (без ':') в полном названии объекта, для ссылки на URI.
     */
    public final String префикс() { return PREFIX; }
    
    public String toQName() 
    {
        return PREFIX == null || PREFIX.trim().isEmpty() ? НАЗВАНИЕ : PREFIX + ':' + НАЗВАНИЕ;
    }

    @Override
    public String toString()
    {
        return new StringBuilder( toQName() )
                .append( '(' ).append( ЗОНА ).append( ')' ).toString();
    }
    
}
