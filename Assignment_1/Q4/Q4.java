package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int binnum = sc.nextInt();
        int n = binnum;
        int pow =0;
        int decNum = 0;

        while(binnum > 0){
            int lastdigit = binnum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }
        System.out.println("Decimal of " + n + " = " + decNum);
    }
}
