public class ExpAndStat {
    public static void main(String[] args) {
        // Expressions - выражения
        // Выражения справа от знака присвоения, внутри скобок метода
        double distance = 150.0;
        double time = 2.5;
        double speed = distance/time;
        System.out.println("Speed: " + speed);

        // Conditional expressions (fruitMessage)
        int apples = 7;
        int oranges = 5;
        String fruitMessage = (apples + oranges > 10)
                            ? "You have a lot of fruits!"
                            : "You have few fruits!";
        System.out.println(fruitMessage);

        // Declaration statement - инструкции присвоения
        int balance = 500; // Вся строчка - инструкция
        balance -= 50; // Expression-statement, выражение-инструкция
        System.out.println("New balance: " + balance);

        // Conditional statement - инструкция условия
        int score = 0;
        score++;
        if (score > 0) {
            System.out.println("Got it!");
        } else {
            System.out.println("Pupupu...");
        }
    }
}
