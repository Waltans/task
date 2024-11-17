package ru.urfu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Тестовый класс для проверки MessageServiceImpl
 */
class MessageServiceImplTest {
    private final MessageService service = new MessageServiceImpl();

    /**
     * Тест проверяет, что при обработке сообщений, сервис выдает нужный результат
     */
    @Test
    void prepareMessageTest() {
        String firstMessage = "Hello World!";

        String result = service.prepareMessage(firstMessage);

        Assertions.assertEquals("Ваше сообщение: Hello World!", result);
    }
}