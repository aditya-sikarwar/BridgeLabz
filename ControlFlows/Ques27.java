package day3;
import java.util.Scanner;

public class Ques27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit:");
		String number =  sc.next();
		sc.close();
		int count=0;
		for(int i=0;i<number.length();i++) {
			count++;
		}
		System.out.println("the number of digits are: "+ count);
	}

}
