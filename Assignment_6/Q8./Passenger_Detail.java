import java.util.Scanner;

class Passenger {
    public int id;
    public String name;
    public int age;
    public String contact;
    public String address;

    public Passenger(int id, String name, int age, String contact, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }

    public void display() {
        System.out.println("\n--- Passenger Details ---");
        System.out.println("Passenger ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
    }
}

public class Passenger_Detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Passenger[] passengers = new Passenger[10];

        System.out.println("Enter details of 10 passengers:");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Passenger " + (i + 1));

            System.out.print("Enter Passenger ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Contact Number: ");
            String contact = sc.next();

            System.out.print("Enter Address: ");
            String address = sc.next();

            passengers[i] = new Passenger(id, name, age, contact, address);
        }
        System.out.println("\n=== Passenger List ===");
        for (Passenger p : passengers) {
            p.display();
        }
    }
}
