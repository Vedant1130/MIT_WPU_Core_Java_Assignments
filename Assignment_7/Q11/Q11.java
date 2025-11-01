package Assignment_7.Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            if (!username.equals(password)) {
                throw new InvalidPasswordException("Invalid Password! Username and password must be same.");
            } else {
                System.out.println("Login Successful!");
            }
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        }

    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}