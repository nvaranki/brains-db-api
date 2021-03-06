package com.varankin.brains.db.type;

import com.varankin.brains.db.DbОператор;
import com.varankin.brains.db.Коллекция;
import com.varankin.brains.db.Типовой;

/**
 * Произвольный узел структуры данных, предназначенный для
 * визуального отображения. Предполагается, что в дереве иерархии от 
 * данного узла не может быть элементов, унаследованных от 
 * {@link DbЭлемент}. Если это всё-таки случится, такие элементы 
 * попадают в коллекцию {@link #прочее()}.
 * Интерфейс {@link Типовой} бросает {@link UnsupportedOperationException}, если 
 * графический элемент не поддерживает типизацию.
 * 
 * @author &copy; 2021 Николай Варанкин
 */
public interface DbГрафика extends Типовой<DbГрафика>, DbУзел //TODO Типовой implied xlink:href only, now deprecated
{
    /**
     * @return вложенные графические элементы. 
     */
    Коллекция<DbГрафика> графики();

    @Override
    default <X> X выполнить( DbОператор<X> оператор, DbАтрибутный узел )
    {
        X результат;
        if( узел instanceof DbГрафика )
            результат = оператор.выполнить( (DbГрафика)узел, графики() );
        else 
            результат = DbУзел.super.выполнить( оператор, узел );
        return результат;
    }
    
}
