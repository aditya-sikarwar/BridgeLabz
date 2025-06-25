import java.util.Scanner;

public class Q8 {

    public static char[] getCharsManual(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] manualArray = getCharsManual(input);
        char[] builtInArray = input.toCharArray();

        boolean result = compareCharArrays(manualArray, builtInArray);

        System.out.println("Manual char array: " + new String(manualArray));
        System.out.println("Built-in char array: " + new String(builtInArray));
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}
