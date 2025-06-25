package day3;
import java.util.Scanner;

public class Ques28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		sc.close();
		
		int store = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				store+=i;
			}}
			 if(store>num) {
				System.out.println(" this num "+ num + " is abundant");
			}
			else
				System.out.println( num + "not abundant");
		
		
	}
	//sc.close();
}	