package Assignment_3.Q7;
import java.util.Scanner;

public class StudentERP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student PRN: ");
        int prn = sc.nextInt();

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Student Gender: ");
        String gender = sc.next();

        System.out.print("Enter Student Contact Number: ");
        int contact = sc.nextInt();

        StudentInfo student = new StudentInfo(prn, name, gender, contact);
        student.display();
    }
}


class StudentInfo {
    int StudPRN;
    String StudName;
    String StudGender;
    int StudContactNumber;

    StudentInfo(int StudPRN,String StudName,String StudGender,int StudContactNumber){
        this.StudPRN = StudPRN;
        this.StudName = StudName;
        this.StudGender = StudGender;
        this.StudContactNumber = StudContactNumber;
    }

    void display() {
        System.out.println("---- Student Information ----");
        System.out.println("PRN: " + StudPRN);
        System.out.println("Name: " + StudName);
        System.out.println("Gender: " + StudGender);
        System.out.println("Contact Number: " + StudContactNumber);
    }
}


