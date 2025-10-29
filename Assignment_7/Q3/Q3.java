package Assignment_7.Q3;

public class Q3 {
    public static void main(String[] args) {
        try {
            String input = args[0];

            if (input.equals(input.toUpperCase())) {
                throw new uppercase("String is in Uppercase");
            } else {
                System.out.println("Input String: " + input);
            }
        } catch (uppercase e) {
            e.printStackTrace();
        }
    }
}

class uppercase extends Exception{
    public uppercase(String message){
        super(message);
    }
}
