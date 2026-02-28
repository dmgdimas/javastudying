public class Client {

    private Messenger messenger;

    // Сеттер, чтобы можно было установить клиенту мессенджер
    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    // Метод для отправки сообщения от имени клиента через выбранный мессенджер
    public void sendMessage() {
        if (messenger != null) {
            messenger.sendMessage();
        } else {
            System.out.println("Мессенджер не установлен!");
        }
    }
}