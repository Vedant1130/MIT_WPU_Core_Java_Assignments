package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n = sc.nextInt();
        int sum = 0;

        while(n>0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
