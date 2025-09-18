package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int decinum = sc.nextInt();
        int n = decinum;
        int pow = 0;
        int binNum = 0;

        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + decinum + " = " + binNum);
    }
}
