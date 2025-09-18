package Assignment_2.Q6.Q6_a;

import java.util.Scanner;

public class Q6_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "");
                counter++;
            }
            System.out.println();
        }

    }
}
