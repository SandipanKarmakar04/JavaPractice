class Bus implements Runnable {
    int availableSeat = 1, passenger;
    Bus(int passenger) {
        this.passenger = passenger;
    }
    public void run() {
        String name = Thread.currentThread().getName();
        if(availableSeat >= passenger) {
            System.out.println(name + "researved");
            availableSeat -= 1;
        } else {
            System.out.println("seat is not available.");
        }
    }
}

public class Synchronization {
    public static void main(String args[]) {
        Bus b = new Bus(1);

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);

        t1.setName("rohit");
        t2.setName("virat");
        t3.setName("dhoni");

        t1.start();
        t2.start();
        t3.start();
    }
}
