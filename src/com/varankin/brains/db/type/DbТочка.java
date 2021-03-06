package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Внешний;
import com.varankin.brains.db.Коллекция;
import com.varankin.brains.db.Параметризованный;
import com.varankin.brains.db.Типовой;

/**
 * Фрагмент схемы расчета.
 * Точки в составе данной служат аргументами вычисляемой функции, 
 * которая специфична и определяется в данной точке.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbТочка extends Параметризованный, Внешний, Типовой<DbТочка>, DbЭлемент
{
    
    /**
     * @return индекс, определяющий порядок использования результата 
     * функции данной точки среди остальных точек.
     */
    Integer индекс();

    /**
     * @param значение индекс, определяющий порядок использования результата 
     * функции данной точки среди остальных точек.
     */
    void индекс( Integer значение );
    
    /**
     * @return признак расчета процессором значения в данной точке.
     */
    Boolean датчик();
    
    /**
     * @param значение  признак расчета процессором значения в данной точке.
     */
    void датчик( Boolean значение );
    
    /**
     * @return симметричный порог совпадения двух значений.
     */
    @Deprecated
    Float порог();
    
    /**
     * @param значение симметричный порог совпадения двух значений.
     */
    @Deprecated
    void порог( Float значение );
    
    /**
     * Ассоциативная ссылка на {@linkplain DbКонтакт контакт}
     * внутреннего {@linkplain DbСоединение соединения} 
     * для корневой или листовой точки дерева точек.
     * 
     * @return {@linkplain DbКонтакт#название() название} {@linkplain DbКонтакт контакта} для передачи или приема сигнала.
     */
    String контакт();
    
    /**
     * @param значение {@linkplain DbКонтакт#название() название} {@linkplain DbКонтакт контакта} для передачи или приема сигнала.
     * @see #контакт() 
     */
    void контакт( String значение );
    
    /**
     * @return точки - аргументы вычисляемой функции.
     */
    Коллекция<DbТочка> точки();
    
    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbКлассJava )
            результат = оператор.выполнить( (DbКлассJava)узел, классы() );
        else if( узел instanceof DbПараметр )
            результат = оператор.выполнить( (DbПараметр)узел, параметры() );
        else if( узел instanceof DbТочка )
            результат = оператор.выполнить( (DbТочка)узел, точки() );
        else 
            результат = DbЭлемент.super.выполнить( оператор, узел );
        return результат;
    }
    
}
