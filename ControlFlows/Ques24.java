package day3;
import java.util.Scanner;

public class Ques24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary");
		int currSalary= sc.nextInt();
		System.out.println("please enter employee working years:");
		int workYear=sc.nextInt();
		
		sc.close();
		if(workYear<5) {
			System.out.println("no incremenet ");
			return;
		}
		else {
			currSalary=(int) (currSalary * (1 + 5 / 100.0));
		}
		System.out.println("salary after increment is is :" +currSalary);
		
		
		
	}

}
