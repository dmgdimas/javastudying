public class Strings {
    public static void main(String[] args) {
        String fruit = "mango";
        System.out.println(fruit.length()); // Длина строки
        System.out.println(fruit.isBlank()); // true если строка пустая или содержит только пробелы
        System.out.println(fruit.toUpperCase());
        String spaces = "  and     ";
        System.out.println(spaces);
        System.out.println(spaces.strip()); // Убирает пробельные символы в начале и в конце
        String noSpaces = "and";
        System.out.println(spaces.equals(noSpaces));
        System.out.println(spaces.strip().equals(noSpaces));
        
    }
}
