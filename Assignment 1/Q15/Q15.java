package Q15;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int [][] matrix = new int [n][n];

        System.out.println("Enter " + (n * n) + " elements:");

        for(int i = 0; i < n; i++){
            for(int j =0; j < n ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int principalSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            principalSum += matrix[i][i];           
            secondarySum += matrix[i][n - 1 - i];  
        }

        System.out.println("Sum of principal diagonal elements = " + principalSum);
        System.out.println("Sum of secondary diagonal elements = " + secondarySum);
    }
}
