package Assignment_3.Q2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }

        Arrays.sort(num);

        
        int largest = num[4];
        int smallest = num[0];

        double average = sum / 5.0;

        System.out.println("Ascending Order: " + Arrays.toString(num));

         System.out.print("Descending Order: [");
        for (int i = 4; i >= 0; i--) {
            System.out.print(num[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Largest Number = " + largest);
        System.out.println("Smallest Number = " + smallest);
        System.out.println("Average = " + average);

    }
}
