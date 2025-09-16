import java.util.Scanner;

abstract class Order {
    public int id;
    public String description;

    abstract void accept();

    abstract void display();
}

class PurchaseOrder extends Order {
    public String customerName;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID: ");
        id = sc.nextInt();
        System.out.print("Enter Description: ");
        description = sc.next();
        System.out.print("Enter Customer Name: ");
        customerName = sc.next();
    }

    void display() {
        System.out.println("\n--- Purchase Order ---");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order{
    public String vendorName;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = sc.nextInt();
        System.out.print("Enter Description: ");
        description = sc.nextLine();
        System.out.print("Enter Vendor Name: ");
        vendorName = sc.nextLine();
    }

    void display(){
        System.out.println("\n--- Sales Order ---");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class Purchase_Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PurchaseOrder [] purchaseOrders = new PurchaseOrder[5];
        SalesOrder [] salesOrders = new SalesOrder[5];
        
        System.out.println("Enter 5 details of Purchase Order: ");
        for(int i =0; i < 5; i++){
            purchaseOrders[i] = new PurchaseOrder();
            purchaseOrders[i].accept();
        }
        System.out.println("Enter 5 details of Sales Order: ");
        for(int i=0; i < 5; i++){
            salesOrders[i] = new SalesOrder();
            salesOrders[i].accept();
        }  

        System.out.println("\n--- Displaying Purchase Orders ---");
        for (int i = 0; i < 5; i++) {
            purchaseOrders[i].display();
        }

        System.out.println("\n--- Displaying Sales Orders ---");
        for (int i = 0; i < 5; i++) {
            salesOrders[i].display();
        }
    }
}
