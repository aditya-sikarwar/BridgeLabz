package day3;
import java.util.Scanner;


public class MeanHeight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] Height = new double[11];
        double sum=0.0;

        for(int i=0; i<Height.length; i++){
            System.out.println("Enter the height of player "+ (i+1)+": ");
            Height[i]=sc.nextDouble();
            sum+=Height[i];
        }

        double mean=sum/Height.length;
        System.out.println("The mean Height of the 11 players is: "+mean);
    }
}