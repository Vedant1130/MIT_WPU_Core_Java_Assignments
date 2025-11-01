package Assignment_8.Q5;

public class Q5 {
    public static void main(String[] args) {
        Shared obj = new Shared();
        new Producer(obj).start();
        new Consumer(obj).start();
    }
}

class Shared {
    boolean flag = false;

    synchronized void produce() {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Producer produced an item");
        flag = true;
        notify();
    }

    synchronized void consume() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consumer consumed the item");
        flag = false;
        notify();
    }
}

class Producer extends Thread {
    Shared s;

    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            s.produce();
        }
    }
}

class Consumer extends Thread {
    Shared s;

    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            s.consume();
        }
    }
}