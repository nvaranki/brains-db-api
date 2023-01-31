package com.varankin.brains.db;

import java.lang.reflect.Array;

/**
 * Преобразователь объектов {@linkplain Object общего типа} 
 * в типы, поддерживаемые базой данных.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbПреобразователь 
{
    static Boolean toBooleanValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Boolean )
        {
            return (Boolean)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).intValue() != 0;
        }
        else if( значение instanceof String )
        {
            return Boolean.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Boolean.valueOf( String.valueOf( (char[])значение ) );
        }
        else 
        {
            // здесь и далее null выглядит лучше чем char[0], для индикации удаленного значения
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static Byte toByteValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Byte )
        {
            return (Byte)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).byteValue();
        }
        else if( значение instanceof String )
        {
            return Byte.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Byte.valueOf( String.valueOf( (char[])значение ) );
        }
        else 
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static Character toCharacterValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Character )
        {
            return (Character)значение;
        }
        else 
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static char[] toCharArrayValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof char[] )
        {
            return (char[])значение;
        }
        else if( значение instanceof String )
        {
            return ( (String)значение ).toCharArray();
        }
        else
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static Short toShortValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Short )
        {
            return (Short)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).shortValue();
        }
        else if( значение instanceof String )
        {
            return ( (String)значение ).isBlank() ? null : Short.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            String текст = String.valueOf( (char[])значение );
            return текст.isBlank() ? null : Short.valueOf( текст );
        }
        else
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static Integer toIntegerValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Integer )
        {
            return (Integer)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).intValue();
        }
        else if( значение instanceof String )
        {
            return Integer.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Integer.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static Long toLongValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Long )
        {
            return (Long)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).longValue();
        }
        else if( значение instanceof String )
        {
            return Long.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Long.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static Float toFloatValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Float )
        {
            return (Float)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).floatValue();
        }
        else if( значение instanceof String )
        {
            return Float.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Float.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static Double toDoubleValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof Double )
        {
            return (Double)значение;
        }
        else if( значение instanceof Number )
        {
            return ( (Number)значение ).doubleValue();
        }
        else if( значение instanceof String )
        {
            return Double.valueOf( (String)значение );
        }
        else if( значение instanceof char[] )
        {
            return Double.valueOf( String.valueOf( (char[])значение ) );
        }
        else
        {
            throw new IllegalArgumentException( String.valueOf( значение ) );
        }
    }
    
    static String toStringValue( Object значение )
    {
        if( значение == null )
        {
            return null;
        }
        else if( значение instanceof String )
        {
            return (String)значение;
        }
        else if( значение instanceof char[] )
        {
            return String.valueOf( (char[])значение );
        }
        else if( значение.getClass().isArray() )
        {
            //TODO deprecated 
            StringBuilder sb = new StringBuilder();
            for( int i = 0, max = Array.getLength( значение ); i < max; i++ )
                sb.append( Array.get( значение, i ) ).append( ' ' );
            return sb.toString().trim();
        }
        else
        {
            //TODO deprecated 
            return значение.toString();
        }
    }
    
    static <T extends Enum<T>> T toEnumValue( Object значение, Class<T> cls )
    {
        Integer i = toIntegerValue( значение );
        T[] values = cls.getEnumConstants();
        return i != null && 0 <= i && i < values.length ? values[i] : null;
    }
    
}
