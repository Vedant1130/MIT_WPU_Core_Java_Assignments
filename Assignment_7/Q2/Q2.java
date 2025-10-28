package Assignment_7.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = Integer.parseInt(args[0]);
            if (num % 7 != 0) {
                throw new notDivisibleBy7("Number should be divisible by 7");
            } else {
                System.out.println("Number is divisible by 7");
            }
        } catch (notDivisibleBy7 e) {
            e.printStackTrace();
        }

    }
}

class notDivisibleBy7 extends Exception {
    public notDivisibleBy7(String message) {
        super(message);
    }

}
