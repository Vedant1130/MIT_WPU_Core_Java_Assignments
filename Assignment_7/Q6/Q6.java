package Assignment_7.Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        Item item[] = new Item[n];
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Enter Item_Code:");
                int item_Code = sc.nextInt();
                System.out.println("Enter the description:");
                String description = sc.next();

                System.out.println("Enter Quantity:");
                int quantity = sc.nextInt();
                System.out.println("Enter price: ");
                int price = sc.nextInt();

                if (item[i].quantity < 0) {
                    throw new QuantityException("Quantity must be positive");
                }
                if (item[i].price < 0) {
                    throw new PriceException("Price must be positive");
                }

                item[i] = new Item(description, quantity, price, item_Code);
            } catch (QuantityException e1) {
                System.out.println("Error: " + e1.getMessage());
            } catch (PriceException e2) {
                System.out.println("Error: " + e2.getMessage());
            }
        }
        for (int i = 0; i < n; i++) {
            item[i].display();
        }
    }
}

class QuantityException extends Exception {
    QuantityException(String message) {
        super(message);
    }
}

class PriceException extends Exception {
    PriceException(String message) {
        super(message);
    }
}

class Item {
    String description;
    int quantity, price, item_Code;

    Item(String description, int quantity, int price, int item_Code) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.item_Code = item_Code;
    }

    void display() {
        System.out.printf("\n Item code: %d \n Description: %s \n Quantity: %d \n Price: %d\n",
                item_Code, description, quantity, price);

    }

}