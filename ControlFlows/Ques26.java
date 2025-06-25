package day3;
import java.util.Scanner;

public class Ques26 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number and the power:");
	int number = sc.nextInt();
	int power=sc.nextInt();
	int result=number;
	for(int i=0;i<power-1;i++) {
		result*=number;
		
	}
	System.out.println(result);
	sc.close();
	
	
			
	}
}


