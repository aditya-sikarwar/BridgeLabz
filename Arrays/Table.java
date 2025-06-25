
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number for multiplication Table: ");
        int num=sc.nextInt();
        int [] arr= new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i]=(i+1)*num;
            System.out.println(arr[i]);
        }

    }
    
}
