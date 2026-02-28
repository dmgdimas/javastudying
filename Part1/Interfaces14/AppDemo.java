public class AppDemo {
    public static void main(String[] args) {
        
        // Создаем нашего клиента
        Client client = new Client();

        // 1. Даем клиенту Telegram
        System.out.println("--- Клиент устанавливает Telegram ---");
        client.setMessenger(new Telegram());
        client.sendMessage(); // Вызовется метод sendMessage() из класса Telegram

        // 2. Теперь тот же клиент решает использовать WhatsApp
        System.out.println("\n--- Клиент переключается на WhatsApp ---");
        client.setMessenger(new WhatsApp());
        client.sendMessage(); // Вызовется метод sendMessage() из класса WhatsApp

        // 3. А теперь Viber
        System.out.println("\n--- Клиент пробует Viber ---");
        client.setMessenger(new Viber());
        client.sendMessage(); // Вызовется метод sendMessage() из класса Viber
    }
}










