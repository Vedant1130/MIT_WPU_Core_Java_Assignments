package Assignment_4.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First staff input
        System.out.println("Enter details of first staff:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Birth Date: ");
        String bdate1 = sc.nextLine();
        System.out.print("Designation: ");
        String desig1 = sc.nextLine();
        System.out.print("Salary: ");
        double sal1 = sc.nextDouble();
        sc.nextLine(); 

        Staff s1 = new Staff(name1, bdate1, desig1, sal1);

        // Second staff input
        System.out.println("\nEnter details of second staff:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Birth Date: ");
        String bdate2 = sc.nextLine();
        System.out.print("Designation: ");
        String desig2 = sc.nextLine();
        System.out.print("Salary: ");
        double sal2 = sc.nextDouble();

        Staff s2 = new Staff(name2, bdate2, desig2, sal2);

        // Display both staff details
        System.out.println("\nDetails of Staff 1:");
        s1.display();

        System.out.println("\nDetails of Staff 2:");
        s2.display();

        // Compare salaries
        System.out.println("\n---- Highest Salary ----");
        if (s1.salary > s2.salary) {
            System.out.println("Staff with highest salary: " + s1.name);
        } else if (s2.salary > s1.salary) {
            System.out.println("Staff with highest salary: " + s2.name);
        } else {
            System.out.println("Both staff have equal salary.");
        }
    }
} 

class Staff{
    String name;
    String birth_date;
    String designation;
    double salary;

    Staff(String name, String birth_date, String designation,double salary){
        this.name = name;
        this.birth_date = birth_date;
        this.designation = designation;
        this.salary = salary;
    }
    void display() {
        System.out.println("---- Staff Details ----");
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birth_date);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
