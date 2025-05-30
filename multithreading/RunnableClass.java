package multithreading;

public class RunnableClass implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {

        }
    }
    public static void main(String args[]) throws InterruptedException {
        RunnableClass r = new RunnableClass();
        Thread t = new Thread(r);
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread main is running...");
            Thread.sleep(1000);
        }
    }
}