package day3;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter no. of persons: ");
        int person=sc.nextInt();

        System.out.println("Enter weight of each persons(in kg): ");
        int[] weight=new int[person];
        for(int i=0; i<weight.length; i++){
            weight[i]=sc.nextInt();
        }

        System.out.println("Enter height of each persons(in m): ");
        double[] height=new double[person];
        int [] status=new int[person];
        for(int i=0; i<height.length; i++){
            height[i]=sc.nextDouble();
        }
         
         double [] bmi= new double[person];
         for(int i=0; i<person; i++){
            bmi[i] = weight[i] / (height[i] * height[i]);


         }
         
         System.out.println("BMI of each person:");
        for (int i = 0; i < person; i++) {
            System.out.println(bmi[i]);
        }
        System.out.println("BMI status: ");
        for(int i=0; i<bmi.length; i++){
            if(bmi[i]<=18.4){
                System.out.println("person "+(i+1)+" Underweight");
            }
            else if(bmi[i]>=18 && bmi[i]<=24.9){
                System.out.println("person "+(i+1)+" Normal");
            }
            else if(bmi[i]>=25.0 && bmi[i]<=39.9){
                System.out.println("person "+(i+1)+" Overweight");
            }
            else {
                System.out.println("person " + (i+1) + " Obese");
            }
        }



    }
    
}
