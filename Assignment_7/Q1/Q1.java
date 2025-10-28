package Assignment_7.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Details: ");
        int n = sc.nextInt();

        Product P[] = new Product[n];

        for (int i = 0; i < n; i++) {
            try {
                P[i] = new Product(i, null, i);
                P[i].accept();
                P[i].display();
            } catch (InvalidProduct e) {
                e.printStackTrace();
            }
        }
    }
}

class Product {

    int productcode;
    String productname;
    int weight;

    Product(int productcode, String productname, int weight) {
        this.productcode = productcode;
        this.productname = productname;
        this.weight = weight;
    }

    void accept() throws InvalidProduct {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Product: ");
        System.out.print("Enter Product Code: ");
        productcode = sc.nextInt();
        System.out.print("Enter Product Name: ");
        productname = sc.next();
        System.out.print("Enter Product Weight: ");
        weight = sc.nextInt();

        if (weight < 100) {
            throw new InvalidProduct("Please add weight more than 100");
        }
    }

    void display() {
        System.out.println("--- Product Details ---");
        System.out.println("Product Code: " + productcode);
        System.out.println("Product Name: " + productname);
        System.out.println("Weight: " + weight);
    }
}

class InvalidProduct extends Exception {
    public InvalidProduct(String message) {
        super(message);
    }
}
