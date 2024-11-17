package ru.urfu;

/**
 * Интерфейс показывает, что должен реализовывать бот
 */
public interface Bot {

    /**
     * Запуск бота
     */
    void start();

    /**
     * Отправить сообщений в бота
     *
     * @param chatId  - id чата, куда нужно отправить сообщение
     * @param message - сообщение
     */
    void sendMessage(String chatId, String message);
}
