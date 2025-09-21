package Assignment_5.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[row][cols];

        System.out.println("Enter elements in matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // a. Row-wise addition
        System.out.println("\nRow-wise addition:");
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row " + i + " sum = " + sum);
        }

        // b. Column wise addition of matrix
        System.out.println("\nColumn-wise addition:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Column " + j + " sum = " + sum);
        }

        // c. Row wise Minimum and Maximum number
        System.out.println("\nRow-wise Minimum and Maximum:");
        for (int i = 0; i < row; i++) {
            int rowMin = matrix[i][0];
            int rowMax = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > rowMin)
                    rowMin = matrix[i][j];
                if (matrix[i][j] < rowMax)
                    rowMax = matrix[i][j];
            }
            System.out.println("Row " + i + " -> Min = " + rowMin + ", Max = " + rowMax);
        }
        // d. Column wise Minimum and Maximum number
        System.out.println("\nColumn-wise Minimum and Maximum:");
        for (int j = 0; j < cols; j++) {
            int colMin = matrix[0][j];
            int colMax = matrix[0][j];
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] > colMin)
                    colMin = matrix[i][j];
                if (matrix[i][j] < colMax)
                    colMax = matrix[i][j];
            }
            System.out.println("Column " + j + " -> Min = " + colMin + ", Max = " + colMax);
        }
    }
}
