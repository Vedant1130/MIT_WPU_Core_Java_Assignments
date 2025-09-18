package Assignment_2.Q6.Q6_d;

public class Q6_d {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            
            for (int j = 1; j < i; j++) {
                System.out.print("  "); 
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
