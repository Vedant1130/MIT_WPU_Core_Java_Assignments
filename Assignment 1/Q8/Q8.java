import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        int letters = 0 , spaces = 0, digits = 0, others = 0;

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Digits: " + digits);
        System.out.println("Other characters: " + others);
    }
}
