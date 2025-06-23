import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double div = num1 / num2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
            num1 + " and " + num2 + " is " + sum + ", " + diff + ", " + prod + ", and " + div);
    }
}
