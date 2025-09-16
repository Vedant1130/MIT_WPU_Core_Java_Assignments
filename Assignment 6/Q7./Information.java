import java.util.Scanner;

abstract class Staff{
    public int no;
    public String name;

    public void initData(int no , String name){
        this.no = no;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("\n--- Staff Details ---");
        System.out.println("No: " + no);
        System.out.println("Name: " + name);
    }
}

class Typist extends Staff{
    public int speed;

    public Typist (int no , String name , int speed){
        initData(no, name);
        this.speed = speed;
    }

    public double calculateSalary() {
        if (speed < 40) {
            return 4000;
        } else {
            return 5000;
        }
    }
    public void display() {
        super.display();
        System.out.println("Speed: " + speed + " wpm");
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Typist No: ");
        int no = sc.nextInt();

        System.out.print("Enter Typist Name: ");
        String name = sc.next();

        System.out.print("Enter Typing Speed (wpm): ");
        int speed = sc.nextInt();

        Typist typist = new Typist(no, name, speed);

        typist.display();
    }
}