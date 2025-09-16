import java.util.Scanner;

abstract class Employee {
    abstract void acceptDetails();

    abstract void displayDetails();
}

class Manager extends Employee {
    public int mid;
    public String mname;
    public int phno;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager ID: ");
        mid = sc.nextInt();
        System.out.print("Enter Manager Name: ");
        mname = sc.next();
        System.out.print("Enter Phone Number: ");
        phno = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("\nManager Details:");
        System.out.println("ID: " + mid);
        System.out.println("Name: " + mname);
        System.out.println("Phone Number: " + phno);
    }

}

class Worker extends Employee {
    public String name;
    public int workingHours;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Worker Name: ");
        name = sc.nextLine();
        System.out.print("Enter Working Hours: ");
        workingHours = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("\nWorker Details:");
        System.out.println("Name: " + name);
        System.out.println("Working Hours: " + workingHours);
    }
}

public class Employee_Detail {
    public static void main(String[]args){
        Employee manager = new Manager();
        Employee worker = new Worker();

        manager.acceptDetails();
        manager.displayDetails();

        worker.acceptDetails();
        worker.displayDetails();
    }

}
