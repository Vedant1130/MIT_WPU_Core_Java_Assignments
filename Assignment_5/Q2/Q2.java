package Assignment_5.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Enter cols of first matrix: ");
        int col1 = sc.nextInt();

      
        System.out.print("Enter rows of second matrix: ");
        int row2 = sc.nextInt();
        System.out.print("Enter cols of second matrix: ");
        int col2 = sc.nextInt();

        int [][] a = new int[row1][col1];
        int [][] b = new int [row2] [col2];
        int [][] res = new int[row1][col2];

        System.out.println("Enter the elements of First Matrix: ");
        for(int i = 0; i<row1; i++){
            for(int j = 0; j<col1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of Second Matrix: ");
        for(int i = 0; i <row2;i++){
            for(int j = 0; j < col2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<row1; i++){
            for(int j = 0; j<col2; j++){
                res[i][j] = 0;
                for(int k = 0; k<col1; k++){
                    res[i][j] += a[i][k] * b[j][k];
                }
            }
        }

        System.out.println("\nResultant Matrix after Multiplication:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
