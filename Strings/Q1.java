import java.util.Scanner;

public class Q1 {

    public static void generateException() {
        String text = "abc";
        int num = Integer.parseInt(text);
    }

    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
        sc.close();
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        handleException();
    }
}
