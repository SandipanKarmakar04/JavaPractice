package multithreading;

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " with priority " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setPriority(2);  
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
