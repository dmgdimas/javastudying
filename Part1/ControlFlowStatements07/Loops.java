public class Loops {
    public static void main(String[] args) {
        // 1. for
        System.out.println("for");
        for (int i = 0; i < 3; i++){
            System.out.println(i);
        }

        // 2. foreach
        int[] arr = {1,2,3,4,5};
        System.out.println("foreach");
        for (int el:arr){
            System.out.println(el);
        }

        // 3. while
        int i = 0;
        System.out.println("while");
        while (i < 5){
            System.out.println(i);
            i++;
        }

        // 4. do while
        System.out.println("do while");
        do {
            System.out.println(i);
            i--;
        } while (i > 3);

        // break - полностью прерывает цикл
        // continue - прерывает текущую итерацию
    }
}
