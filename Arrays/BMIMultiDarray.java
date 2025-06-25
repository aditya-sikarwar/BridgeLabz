package day3;

import java.util.*;

public class BMIMultiDarray {
	
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of persons: ");
        int person=sc.nextInt();
        
        
        String[]status=new String [person];
        double[][] matrix= new double [person][3];
        
        System.out.println("Enter the details of each player: ");
        
        for(int i=0; i<person; i++) {
        	System.out.println("Player "+(i+1)+":");
        	
        	System.out.println("Enter Height(in m): ");
        	matrix[i][0]=sc.nextDouble();
        	
        	System.out.println("Enter Weight(in kg): ");
        	matrix[i][1]=sc.nextDouble();
        	
        	double Height=matrix[i][0];
        	double Weight=matrix[i][1];
        	
        	matrix[i][2]=Weight/(Height*Height);
        	
        	if(matrix[i][2]<=18.4) {
        		status[i]="Underweight";
        	}
        	else if(matrix[i][2]<=24.9) {
        		status[i]="Normal";
        	}
        	else if(matrix[i][2]<=39.9) {
        		status[i]="Overweight";
        	}else {
        		status[i]="Obese";
        	}
    
        }
        
       for(int i=0; i<person; i++) {
    		   System.out.println("Player "+(i+1)+" ->" +
    				   " Height: "+ matrix[i][0] +
    				   " Weight: "+ matrix[i][1] + 
    				   " BMI: "+matrix[i][2] +
    			       " Status: "+status[i]);
       }
        
        
    }
}
