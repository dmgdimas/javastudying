import java.util.Locale;
import java.util.Scanner;

public class UserInputNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // double через точку
        System.out.println("Name:");
        String name = input.nextLine();
        System.out.println("Age:");
        int age = input.nextInt();
        System.out.println("Points:");
        double points = input.nextDouble();
        System.out.println(name + ", " + age + " years, " + points + " points.");
    }
}
