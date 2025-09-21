package Assignment_5.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int [] arr = new int [n];

        System.out.println("Enter" + n + "elements: ");
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to delete (0 to " + (n - 1) + "): ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
            return;
        }
        int [] newArr = new int[n-1];

        for (int i = 0, j = 0; i < n; i++) {
            if (i == index) continue; // skip element
            newArr[j++] = arr[i];
        }

        System.out.println("Array after deletion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
