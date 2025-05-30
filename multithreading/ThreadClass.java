package multithreading;

public class ThreadClass extends Thread {
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
        ThreadClass t = new ThreadClass();
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread main is running...");
            Thread.sleep(1000);
        }
    }
}
