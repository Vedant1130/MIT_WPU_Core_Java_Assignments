package Assignment_7.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            int n = sc.nextInt();

            if (n < 0) {
                throw new NegativeValueException("Number should be positive");
            }
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }

    }

}

class NegativeValueException extends Exception{
    public NegativeValueException (String message){
        super(message);
    }
}

