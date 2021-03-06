package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Внешний;
import com.varankin.brains.db.Параметризованный;

/**
 * Фрагмент {@linkplain DbСоединение соединения} для приема-передачи
 * одного {@link DbСигнал сигнала}.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbКонтакт extends Внешний, Параметризованный, DbЭлемент
{
    public short НЕТ      = 0x0000;
    public short ИСТОЧНИК = 0x0001;
    public short ПРИЕМНИК = 0x0002;
    
    /**
     * @return сигнал контакта.
     */
    String сигнал();
    
    /**
     * @param значение сигнал контакта.
     */
    void сигнал( String значение );
    
    /**
     * @return сигнал контакта.
     */
    @Deprecated
    DbСигнал сигналКонтакта();
    
    /**
     * @return приоритет данного контакта при передаче информации сигнала по контактам.
     */
    Integer приоритет();
    
    /**
     * @param значение приоритет данного контакта при передаче информации сигнала по контактам.
     */
    void приоритет( Integer значение );
    
    /**
     * @return флаги свойств контакта.
     */
    Short свойства();
    
    /**
     * @param значение флаги свойств контакта.
     */
    void свойства( Short значение );

    /**
     * Ассоциативная ссылка на {@linkplain DbТочка точку} {@linkplain DbРасчет расчета} для
     * контакта внутреннего {@linkplain DbСоединение соединения}.
     * 
     * @return {@linkplain DbТочка#название() название} корневой или листовой {@linkplain DbТочка точки} дерева контактов.
     */
    String точка();
    
    /**
     * @param значение {@linkplain DbТочка#название() название} корневой или листовой {@linkplain DbТочка точки} дерева контактов.
     * @see #точка() 
     */
    void точка( String значение );
    
    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbКлассJava )
            результат = оператор.выполнить( (DbКлассJava)узел, классы() );
        else if( узел instanceof DbПараметр )
            результат = оператор.выполнить( (DbПараметр)узел, параметры() );
        else 
            результат = DbЭлемент.super.выполнить( оператор, узел );
        return результат;
    }
    
}
