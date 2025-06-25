import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double userInput;
        System.out.println("Enter a number (enter 0 to stop):");
        while (true) {
             userInput = sc.nextDouble();
             if (userInput == 0) {
                  break;
             }
             total += userInput;
        }
        System.out.println("Sum of numbers entered (until 0) is: " + total);
        sc.close();
    }
} 