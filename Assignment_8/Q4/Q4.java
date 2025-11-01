package Assignment_8.Q4;

public class Q4 {
    public static void main(String[] args) {
        Table obj = new Table();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}

class Table {
    // Synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Synchronized block (synchronized statement)
    void printSquare(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Square of " + i + ": " + (i * i));
                // try {
                //     Thread.sleep(400);
                // } catch (InterruptedException e) {
                //     System.out.println(e.getMessage());
                // }
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printSquare(5);
    }
}
