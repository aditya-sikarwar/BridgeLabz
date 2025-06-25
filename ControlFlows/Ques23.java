package day3;
import java.util.Scanner;

public class Ques23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int number = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) 
			
			System.out.println(i);
			
		}
		
	}

}
