package ru.urfu;

/**
 * Реализация messageService для обработки сообщений
 */
public class MessageServiceImpl implements MessageService {


    @Override
    public String prepareMessage(String message) {
        return String.format("Ваше сообщение: %s", message);
    }
}
