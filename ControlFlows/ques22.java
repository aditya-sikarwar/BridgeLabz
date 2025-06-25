package day3;
import java.util.*;

public class ques22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = sc.nextInt();
		sc.close();
		int greatestFactor=1;
		int counter = number - 1;
		while(counter>=1) {
			if(number%counter==0) {
				greatestFactor=counter;
				//System.out.println();
				break;
				
			}
			else counter--;
		}
		
		System.out.println("your greatest factor for the given number"+ number +" "+ "is" +" "+ greatestFactor);
		
	}
	

	
}
