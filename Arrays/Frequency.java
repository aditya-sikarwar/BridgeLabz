package day3;

import java.util.*;

public class Frequency{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		num=Math.abs(num);
		int temp=num;
		int count=0;
		
		if (temp==0) {
			count=1;
		}
		else {
			while(temp>0) {
				count++;
				temp/=10;
			}
		}
		
		int[]digit=new int[count];
		temp=num;
		
		for(int i= count-1; i>=0; i--) {
			digit[i]=temp%10;
			temp/=10;
		}
		
		int [] freq= new int[10];
		for(int i=0; i<digit.length; i++) {
			freq[digit[i]]++;
		}
		
		
		
		for(int i=0; i<freq.length; i++) {
			System.out.println("freq of "+i+" digit is: "+freq[i]+" ");
		}
		
	}
}
