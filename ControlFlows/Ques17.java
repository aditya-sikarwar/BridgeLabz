import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
             System.out.println("Please enter a positive integer.");
             sc.close();
             return;
        }
        for (int i = 1; i <= n; i++) {
             if (i % 15 == 0) {
                  System.out.println("FizzBuzz");
             } else if (i % 3 == 0) {
                  System.out.println("Fizz");
             } else if (i % 5 == 0) {
                  System.out.println("Buzz");
             } else {
                  System.out.println(i);
             }
        }
        sc.close();
    }
} 