import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter lines (type 'good bye' to stop):");

        while (true) {
            String line = sc.nextLine();

            if (line.equalsIgnoreCase("good bye")) {
                break;
            }
            if (line.contains("India") || line.contains("Hello")) {
                System.out.println(line);
                count++;
            }
        }
        System.out.println("\nNumber of matching lines: " + count);
    }

}