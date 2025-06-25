import java.util.Scanner;

public class Q2 {

    public static void generateException() {
        String str = "hello";
        char ch = str.charAt(10); // Invalid index
    }

    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        try {
            char ch = input.charAt(10);
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
        sc.close();
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        handleException();
    }
}
