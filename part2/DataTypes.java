import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        //Ввод числа
        Scanner input = new Scanner(System.in);
        System.out.println("enter age: ");
        if (input.hasNextInt()){
            int age = input.nextInt();
            Integer ageInteger = age;
            System.out.println("Your age: " + ageInteger.toString());
        } else {
            System.out.println("It is not a number!");
        }
        input.close();
        //Ввод строки из файла
        try{
            Scanner file = new Scanner(new File("src/test1.txt"));
            file.useDelimiter(",");
            while (file.hasNext()){
                System.out.println(file.next());
            }
            file.close();
        } catch (FileNotFoundException e){
            System.out.println("File has not found!");
            e.printStackTrace();
        }
        
    }
}
