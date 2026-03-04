public class MultyThreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        // Поток A
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        System.out.println("Thread t1 name: " + t1.getName());
        System.out.println("Thread t1 state: " + t1.getState());
        System.out.println("Thread t1 priority: " + t1.getPriority());
        System.out.println("Thread t1 is alive: " + t1.isAlive());
        System.out.println("Thread t1 id: " + t1.threadId());
        System.out.println("t1 to string: " + t1.toString() + "\n");
        t1.setName("ThreadAtest");
        t1.start();
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        System.out.println("Thread t1 name: " + t1.getName());
        System.out.println("Thread t1 state: " + t1.getState());
        System.out.println("Thread t1 priority: " + t1.getPriority());
        System.out.println("Thread t1 is alive: " + t1.isAlive());
        System.out.println("Thread t1 id: " + t1.threadId());
        System.out.println("t1 to string: " + t1.toString() + "\n");
    }
    
}