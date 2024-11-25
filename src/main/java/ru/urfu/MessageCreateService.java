package ru.urfu;

/**
 * Сервис для создания сообщений
 */
public class MessageCreateService {

    /**
     * Создание сообщения
     * @param message - сообщение, которое нам поступило
     * @return - сообщение
     */
    public String createMessage(String message) {
        return "Ваше сообщение: " + message;
    }
}
