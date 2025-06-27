import java.util.*;

public class NumberDemo {
    public static void main(String[] args) {
        int number = 12321; // You can change this number to test
        int[] digits = NumberDemo.getDigits(number);
        int count = digits.length;

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);

        int[] reversedDigits = NumberDemo.reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversedDigits) {
            System.out.print(d);
        }
        System.out.println();

        boolean isPalindrome = NumberDemo.isPalindrome(digits);
        boolean isDuck = NumberDemo.isDuck(digits);

        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
    }

    // 1. Get digits
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // 2. Reverse digits
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // 3. Compare arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // 4. Check if Palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // 5. Check if Duck number
    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}
