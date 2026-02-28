public class Arrays {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[10];
        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]); // равен нулю, если не объявлен
        int[] arr2 = new int[5];
        arr2[0] = 4;
        System.out.println(arr2[0]);
        int[] arr3 = {1,2,3,4,5};
        System.out.println(arr3[2]);
    }
}
