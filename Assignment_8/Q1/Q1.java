package Assignment_8.Q1;

public class Q1 {
    public static void main(String[] args) {
        Divby8 t1 = new Divby8();
        t1.start();
        Even51to100 t2 = new Even51to100();
        t2.start();
        Awesome t3 = new Awesome();
        t3.start();
    }
}

class Divby8 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 8 == 0) {
                System.out.println("Number Divisible by 8 is " + i);
            }
        }
    }

}

class Even51to100 extends Thread {
    public void run() {
        for (int i = 52; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Awesome extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Java is Awesome");

        }
    }
}