package day3;
import java.util.*;

public class Youngest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter height: ");
		int []Height=new int[3];
		for(int i=0; i<3; i++) {
			Height[i]=sc.nextInt();
		}
		
		System.out.println("Enter age: ");
		int [] age= new int[3];
		for(int i=0; i<3; i++) {
			age[i]=sc.nextInt();
		}
		int youngest=0;
		for(int i=0; i<3; i++) {
			if(age[i]<age[i+1]) {
			youngest=age[i];
			}
			else {
				youngest=age[i+1];
			}
		}
		System.out.println("youngest in age is: " + youngest);
		
	}
}