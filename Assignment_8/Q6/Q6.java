package Assignment_8.Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degree = sc.nextDouble();

        Sin s = new Sin(degree);
        Cos c = new Cos(degree);
        Tan t = new Tan(degree);

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(t);

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All calculations completed!");
        // sc.close();
    }
}

class Sin implements Runnable {
    double degree;

    Sin(double degree) {
        this.degree = degree;
    }

    public void run() {
        double radians = Math.toRadians(degree);
        double sin = Math.sin(radians);
        System.out.println("Sin(" + degree + ") = " + sin);
    }
}

class Cos implements Runnable {
    double degree;

    Cos(double degree) {
        this.degree = degree;
    }

    public void run() {
        double radians = Math.toRadians(degree);
        double cos = Math.cos(radians);
        System.out.println("Cos(" + degree + ") = " + cos);
    }
}

class Tan implements Runnable {
    double degree;

    Tan(double degree) {
        this.degree = degree;
    }

    public void run() {
        double radians = Math.toRadians(degree);
        double tan = Math.tan(radians);
        System.out.println("Tan(" + degree + ") = " + tan);
    }
}
