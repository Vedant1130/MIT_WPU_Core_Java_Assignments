package Assignment_7.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Students: ");
        int n = sc.nextInt();
        System.out.print("Enter No. of Subjects per Student: ");
        int totalSubject = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of Student " + (i + 1) + ": ");
            String name = sc.next();

            students[i] = new Student(name, totalSubject);

            try {
                students[i].acceptMarks();
            } catch (ZeroMarksException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < n; i++) {
            students[i].displayResult();
        }
    }
}

interface CalculateResult {
    int calculateTotal();

    double calculatePercentage();

    String calculateGrade();
}

class Student implements CalculateResult {
    public String name;
    public int[] marks;
    public int totalSubject;

    public Student(String name, int totalSubject) {
        this.name = name;
        this.totalSubject = totalSubject;
        this.marks = new int[totalSubject];
    }

    public void acceptMarks() throws ZeroMarksException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for " + totalSubject + " subjects:");
        for (int i = 0; i < totalSubject; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0) {
                throw new ZeroMarksException("Marks cannot be less than zero for " + name);
            }
        }
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentage() {
        return (double) calculateTotal() / totalSubject;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else if (percentage >= 30) {
            return "E";
        } else {
            return "Fail";
        }
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Grade: " + calculateGrade());
    }

}

class ZeroMarksException extends Exception {
    ZeroMarksException(String message) {
        super(message);
    }
}
