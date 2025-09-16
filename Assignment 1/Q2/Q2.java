package Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int S1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int S2 = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int S3 = sc.nextInt();
        System.out.println("Enter Fourth Number: ");
        int S4 = sc.nextInt();
        System.out.println("Enter Fifth Number: ");
        int S5 = sc.nextInt();

        int Average = S1 + S2 + S3 + S4 + S5 / 5;

        System.out.println("Average of 5 number is :" + Average);


    }
}

