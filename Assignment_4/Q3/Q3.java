package Assignment_4.Q3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Ascending Order
        Arrays.sort(arr);
        System.out.println("\nNumbers in Ascending Order: " + Arrays.toString(arr));

        // Summation of two rows
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of numbers: " + sum);

        // Average
        double avg = (double) sum / arr.length;
        System.out.println("Average of numbers: " + avg);

        // Search a number in the array
        System.out.print("\nEnter number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Number " + search + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in the array.");
        }

        System.out.println("\nPrime numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("Prime Number: " + num + " at index " + i);
            }
        }
    }
}
