public class TryCatch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            System.out.println(arr[500]);
        } catch (Exception e) {
            System.out.println("Detected exception " + e);
        }
    }
}
