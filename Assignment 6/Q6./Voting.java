import java.util.Scanner;

class Voter {
    public String voterName;
    public String voterAddress;
    public int voterContactNo;
    public int voterAadhar;

    public Voter(String voterName,String voterAddress,int voterContactNo,int voterAadhar){
        this.voterName = voterName;
        this.voterAddress = voterAddress;
        this.voterContactNo = voterContactNo;
        this.voterAadhar = voterAadhar;
    }

    public void display() {
        System.out.println("\n--- Voter Details ---");
        System.out.println("Name: " + voterName);
        System.out.println("Address: " + voterAddress);
        System.out.println("Contact No: " + voterContactNo);
        System.out.println("Aadhar: " + voterAadhar);
    }
}

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Voter[] voters = new Voter[10];

        System.out.println("Enter details of 10 voters:");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Voter " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Address: ");
            String address = sc.next();

            System.out.print("Enter Contact No: ");
            int contact = sc.nextInt();

            System.out.print("Enter Aadhar No: ");
            int aadhar = sc.nextInt();

            voters[i] = new Voter(name, address, contact, aadhar);
        }

        System.out.println("\n=== Voter List ===");
        for (Voter v : voters) {
            v.display();
        }
    }
}
