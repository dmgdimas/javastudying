public class ConvertTypes {
    public static void main(String[] args) {
        // Implicit - неявное приведение (расширяющее)
        // От узкого к широкому
        int numberOfSold = 1500;
        long totalSold = numberOfSold;
        System.out.println("Total sold: "+totalSold);
        
        // Explicit - явное приведение (сужающее)
        // От широкого к узкому
        // Возможна потеря данных!!!
        long yearRevenue = 2_500_000_000l;
        int totalRevenue = (int) yearRevenue;
        System.out.println("Data lose: "+totalRevenue); // Output: -1794967296

        // char to int (Implicit)
        char symbol = '$';
        int number = symbol;
        System.out.println("char2int: $ -> "+number);

        // int to chat (Explicit)
        int score = 86;
        char scoreChar = (char) score;
        System.out.println("86 in ASCII: " + scoreChar);

    }
}
