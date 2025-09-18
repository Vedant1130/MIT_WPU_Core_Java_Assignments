package Assignment_2.Q6.Q6_c;

public class Q6_c {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print stars with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
