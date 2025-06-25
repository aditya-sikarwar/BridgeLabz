import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter a number (enter 0 or a negative number to stop):");
        while (true) {
             double userInput = sc.nextDouble();
             if (userInput <= 0) {
                  break;
             }
             total += userInput;
        }
        System.out.println("Sum of numbers (until 0 or negative) is: " + total);
        sc.close();
    }
} 