import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();
        if (n <= 0) {
             System.out.println("Please enter a positive natural number.");
             sc.close();
             return;
        }
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
             sumFor += i;
        }
        int sumFormula = (n * (n + 1)) / 2;
        System.out.println("Sum computed using for loop: " + sumFor);
        System.out.println("Sum computed using formula (n*(n+1))/2: " + sumFormula);
        if (sumFor == sumFormula) {
             System.out.println("Both computations are correct.");
        } else {
             System.out.println("Computations differ.");
        }
        sc.close();
    }
} 