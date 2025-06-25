package day3;
import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (positive and less than 100): ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Number must be positive and less than 100.");
            return;
        }
        
        int counter = number - 1;

        System.out.println("Multiples of " + number + " less than 100:");
        while (counter > 1) {
            if (counter * number < 100) {
                System.out.println(counter * number);
            }
            counter--;
            
        }
        
    }
}
