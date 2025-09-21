package Assignment_5.Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

        int [][] matrix = new int[rows][cols];

        System.out.println("Enter elements of matrics: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number to insert: ");
        int num = sc.nextInt();

        System.out.print("Enter row index (0 to " + (rows - 1) + "): ");
        int r = sc.nextInt();
        System.out.print("Enter column index (0 to " + (cols - 1) + "): ");
        int c = sc.nextInt();

        if (r >= 0 && r < rows && c >= 0 && c < cols) {
            matrix[r][c] = num; 
        } else {
            System.out.println("Invalid index!");
        }
        System.out.println("\nMatrix after insertion:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
