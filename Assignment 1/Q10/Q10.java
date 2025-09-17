package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();

        int [] arr = new int [n];
        int [] newArr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i < n; i++){
            newArr[i] = arr[i];
        }

        if(n > 1){
            int temp = newArr[0];
            newArr[0] = newArr[n - 1];
            newArr[n - 1] = temp;
        }
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nNew array (after swap): ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
