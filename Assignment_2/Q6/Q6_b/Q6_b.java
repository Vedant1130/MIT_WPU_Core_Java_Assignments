package Assignment_2.Q6.Q6_b;

import java.util.Scanner;

public class Q6_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();

        char ch ='A';

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(ch + "");
            }
            System.out.println();
            ch++;
        }
    }
}
