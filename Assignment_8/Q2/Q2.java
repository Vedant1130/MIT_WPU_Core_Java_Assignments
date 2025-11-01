package Assignment_8.Q2;

public class Q2 {
    public static void main(String[] args) {
        AtoZ t1 = new AtoZ();
        Fibonacci t2 = new Fibonacci();

        t1.start();
        t2.start();
    }
}

class AtoZ extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println("Letter: " + c);
            }
        }

    }
}

class Fibonacci extends Thread {
    public void run() {
        int a = 0, b = 1;
        for (int i = 0; i < 15; i++) {
            System.out.println("Fibonacci: " + a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}