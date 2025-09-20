package Assignment_4.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept customer details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int acNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        // Create Bank object
        Bank customer = new Bank(name, acNo, bal);

        // Perform operations
        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        customer.deposit(dep);

        System.out.print("\nEnter amount to withdraw: ");
        double wd = sc.nextDouble();
        customer.withdraw(wd);
    }
}

class Bank {
    String cust_name;
    int Ac_no;
    double balance;

    Bank(String cust_name, int Ac_no, double balance) {
        this.cust_name = cust_name;
        this.Ac_no = Ac_no;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        displayBalance();
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
