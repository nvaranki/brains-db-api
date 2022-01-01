package com.varankin.brains.db;

import com.varankin.brains.db.type.DbПроцессор;
import com.varankin.brains.db.type.DbСигнал;
import com.varankin.brains.db.type.DbФрагмент;
import com.varankin.brains.db.type.DbБиблиотека;

/**
 * Объединяющий элемент мыслительной структуры. 
 * Состоит из фрагментов, связанных 
 * сигналами, а также локальных библиотек и процессоров.
 *
 * @author &copy; 2021 Николай Варанкин
 */
public interface Коллективный
{

    /**
     * @return локальные библиотеки
     */
    Коллекция<DbБиблиотека> библиотеки();

    /**
     * @return экземпляры {@linkplain DbМодуль модулей},
     * {@linkplain DbРасчет расчетов} и {@linkplain DbПоле полей}.
     */
    Коллекция<DbФрагмент> фрагменты();
    
    /**
     * @return экземпляры {@link DbПроцессор процессоров}.
     */
    Коллекция<DbПроцессор> процессоры();

    /**
     * @return каналы передачи информации.
     */
    Коллекция<DbСигнал> сигналы();

}
