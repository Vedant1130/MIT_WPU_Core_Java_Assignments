import java.util.Scanner;

class Employee {
    public int empId;
    public String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public double calcSal() {
        return 0.0;
    }

    public void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
    }
}

class TemporaryEmployee extends Employee {
    public int hoursWorked;
    public int overtimeHours;
    public double hourlyRate;

    public TemporaryEmployee(int empId, String name, int hoursWorked, int overtimeHours, double hourlyRate) {
        super(empId, name);
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    public double calcSal() {
        return (hoursWorked * hourlyRate) + (overtimeHours * (hourlyRate * 1.5));
    }

    public void display() {
        super.display();
        System.out.println("Type: Temporary");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Salary: " + calcSal());
    }
}

class PermanentEmployee extends Employee {
    public int workingDays;
    public double dailyWage;

    public PermanentEmployee(int empId, String name, int workingDays, double dailyWage) {
        super(empId, name);
        this.workingDays = workingDays;
        this.dailyWage = dailyWage;
    }

    public double calcSal() {
        return workingDays * dailyWage;
    }

    public void display() {
        super.display();
        System.out.println("Type: Permanent");
        System.out.println("Working Days: " + workingDays);
        System.out.println("Daily Wage: " + dailyWage);
        System.out.println("Salary: " + calcSal());
    }
}

public class Employee_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temporary Employee Details:");
        System.out.print("ID: ");
        int tId = sc.nextInt();
        System.out.print("Name: ");
        String tName = sc.next();
        System.out.print("Hours Worked: ");
        int hoursWorked = sc.nextInt();
        System.out.print("Overtime Hours: ");
        int overtime = sc.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = sc.nextDouble();

        TemporaryEmployee tempEmp = new TemporaryEmployee(tId, tName, hoursWorked, overtime, hourlyRate);

        System.out.println("\nEnter Permanent Employee Details:");
        System.out.print("ID: ");
        int pId = sc.nextInt();
        System.out.print("Name: ");
        String pName = sc.next();
        System.out.print("Working Days: ");
        int workingDays = sc.nextInt();
        System.out.print("Daily Wage: ");
        double dailyWage = sc.nextDouble();

        PermanentEmployee permEmp = new PermanentEmployee(pId, pName, workingDays, dailyWage);

        tempEmp.display();
        permEmp.display();
    }

}