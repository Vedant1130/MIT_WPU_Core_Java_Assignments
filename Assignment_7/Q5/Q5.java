package Assignment_7.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = sc.next();

        try {

            if (Character.isDigit(email.charAt(0))) {
                throw new InvalidEmailException("Email should not start with a digit.");
            }

            if (!email.contains("@")) {
                throw new InvalidEmailException("Email must contain '@' symbol.");
            }

            System.out.println("Valid email address.");
        } catch (InvalidEmailException e) {
            System.out.println("InvalidEmailException: " + e.getMessage());
        }
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}