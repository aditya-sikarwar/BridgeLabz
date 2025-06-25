package day3;
import java.util.Scanner;

public class Ques25 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number (positive integer less than 100): ");
	        String input = scanner.nextLine();

	        if (input.matches("\\d+")) {
	            int number = Integer.parseInt(input);
	            if (number > 0 && number < 100) {
	                System.out.println("Multiples of " + number + " below 100 are:");
	                for (int i = 100; i >= 1; i--) {
	                    if (i % number == 0) {
	                        System.out.println(i);
	                    }
	                }
	            } else 
	                System.out.println("Error: The number must be a positive integer less than 100.");
	            
	        } else 
	            System.out.println("Error: Invalid input. Please enter a numeric value.");
	        

	        scanner.close();
		
		
	}

}
