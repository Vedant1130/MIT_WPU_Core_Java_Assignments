package Q13;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
            for (int i = 0; i < b; i++) {
                a++;
            }
        
        System.out.println("Sum = " + a);

    }
}
