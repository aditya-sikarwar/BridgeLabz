import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
             result *= number;
             ++counter;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
        sc.close();
    }
} 