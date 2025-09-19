package Assignment_3.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; 
            } else {
                sum += i; 
            }
        }
        System.out.println("Sum of series up to " + n + " = " + sum);
    }
}
