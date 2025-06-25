import java.util.Scanner;

public class Q5 {

    public static void generateIllegalArgumentException() {
        String text = "Example";
        String sub = text.substring(5, 2); // Start index > end index (will throw exception)
    }

    public static void handleIllegalArgumentException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        try {
            String sub = input.substring(5, 2); // Start index > end index
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
        sc.close();
    }

    public static void main(String[] args) {
        try {
            generateIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        handleIllegalArgumentException();
    }
}
