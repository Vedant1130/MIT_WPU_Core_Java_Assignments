package Assignment_2.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0 ;

        for(int i = 1; i <= num/2 ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if (sum == num && num > 0) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
    }
}
