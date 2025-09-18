import java.util.Scanner;
interface CalculateResult{
    int calculateTotal();
    double calculatePercentage();
    String calculateGrade();
}

class Student implements CalculateResult{
    public String name;
    public int [] marks ;
    public int totalSubject;

    public Student(String name ,int totalSubject){
        this.name = name;
        this.totalSubject = totalSubject;
        this.marks = new int[totalSubject];
    }

    public void acceptMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for " + totalSubject + " subjects:");
        for (int i = 0; i < totalSubject; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    public int calculateTotal(){
        int total = 0;
        for(int mark : marks){
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
        } else if (percentage >= 75) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
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

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        // Create student object
        Student student = new Student(name, subjects);

        // Accept marks
        student.acceptMarks();

        // Display results
        student.displayResult();
    }
}
