public class A implements Runnable{
    @Override
    public void run() {
        System.out.println("A: " + Thread.currentThread().getName() + " started!");
    }
}