package day3;
import java.util.Scanner;

public class MultiDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter rows: ");
        int rows=sc.nextInt();

        System.out.println("Enter colums: ");
        int cols=sc.nextInt();

        int[][] matrix=new int[rows][cols];

        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j]=sc.nextInt();
            }
        }

        int [] arr=new int[rows*cols];
        int index=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[index]=matrix[i][j];
                index++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
    
}
