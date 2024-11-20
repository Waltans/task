package ru.urfu;

/**
 * Сервис для обработки сообщений
 */
public class MessageService {
    /**
     * Обработка сообщения
     * @param message - сообщение, которое нам поступило
     * @return - "Ваше сообщение: " + message
     */
    public String prepareMessage(String message) {
        return String.format("Ваше сообщение: %s", message);
    }
}
