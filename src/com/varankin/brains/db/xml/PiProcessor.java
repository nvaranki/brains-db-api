package com.varankin.brains.db.xml;

/**
 * Процессор инструкций XML (Processing Instructions).
 * Обрабатывает XML элементы типа {@literal <?target instruction ?> }.
 *
 * @author &copy; 2021 Николай Варанкин
 * 
 * @param <T> класс владельца, в контексте которого выполняется инструкция.
 */
public interface PiProcessor<T> 
{
    /**
     * Выполняет инструкцию.
     * 
     * @param владелец   объект, в контексте которого выполняется инструкция.
     * @param инструкция инструкция для выполнения.
     * @return текст, полученный в ходе выполнения инструкции.
     */
    String выполнить( T владелец, String инструкция );
}
