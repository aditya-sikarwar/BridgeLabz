import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int digits=String.valueOf(Math.abs(num)).length();

        int [] arr= new int[digits];
        for(int i=0; i<digits; i++){
            arr[i]=num%10;
            num/=10;
        }
        int max1=0;
        int max2=0;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else{
            max2=arr[0];
            max1=arr[1];
        }

        for(int i=2; i<arr.length; i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("The largest number is: "+max1);
        System.out.println("The second largest number is: "+max2);

    }
}
