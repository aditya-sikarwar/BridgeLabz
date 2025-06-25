import java.util.Scanner;

public class Q6 {

    public static String createSubstringWithCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = createSubstringWithCharAt(text, start, end);
        String builtInSub = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtInSub = text.substring(start, end);
        }

        boolean areEqual = compareUsingCharAt(manualSub, builtInSub);

        System.out.println("Manual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both equal? " + areEqual);

        sc.close();
    }
}
