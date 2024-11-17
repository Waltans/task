package ru.urfu;

/**
 * Сервис по работе с сообщениями
 */
public interface MessageService {

    /**
     * Обработка сообщение
     *
     * @param message - сообщение от пользователя
     * @return - обработанное сообщение
     */
    String prepareMessage(String message);
}
