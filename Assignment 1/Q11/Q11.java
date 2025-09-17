package Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int [n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int even=0 , odd =0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
}
