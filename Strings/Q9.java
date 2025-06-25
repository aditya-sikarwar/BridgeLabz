import java.util.Scanner;

public class Q9 {

    public static void generateArrayIndexOutOfBoundsException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        String name = names[5]; // Invalid index (will throw exception)
    }

    public static void handleArrayIndexOutOfBoundsException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        try {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }

        sc.close();
    }

    public static void main(String[] args) {
        try {
            generateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        handleArrayIndexOutOfBoundsException();
    }
}
