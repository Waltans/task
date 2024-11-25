package ru.urfu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Тестовый класс для проверки MessageCreateService
 */
class MessageCreateServiceTest {
    private final MessageCreateService service = new MessageCreateService();

    /**
     * Тест проверяет, что при обработке сообщений, сервис выдает нужный результат
     */
    @Test
    void createMessageTest() {
        String firstMessage = "Hello World!";

        String result = service.createMessage(firstMessage);

        Assertions.assertEquals("Ваше сообщение: Hello World!", result);
    }
}