package Assignment_5.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];
        int [][] b = new int[rows][cols];
        int [][] sum = new int[rows][cols];

        System.out.println("Enter elements of first matrics: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrics: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<rows; i++){
            for(int j = 0; j<cols;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nResultant Matrix after Addition:");
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
