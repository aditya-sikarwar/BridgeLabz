package day3;
import java.util.Scanner;

public class FizzzBuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        String [] arr= new String[num];

        if(num>0){
            for(int i=0; i<arr.length; i++){
                int value=i+1;

                if (value % 3 == 0 && value % 5 == 0) {
                    arr[i] = "FizzBuzz";
                } else if (value % 3 == 0) {
                    arr[i] = "Fizz";
                } else if (value % 5 == 0) {
                    arr[i] = "Buzz";
                } else {
                    arr[i] = String.valueOf(value);
                }
            }
            for(int i=0; i<arr.length; i++){
                    System.out.println(arr[i]);
            }

           
        }
        else{
            System.out.println("Invalid number");
        }
       
    
    }
}
