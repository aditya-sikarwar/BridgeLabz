
import java.util.Scanner;

public class VoteAge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] age= new int[10];

        for(int i=0; i<age.length; i++){
            System.out.println("Enter the age of Student "+ (i+1)+": ");
            age[i]=sc.nextInt();
        }

        System.out.println("eligibility to vote: ");
        for(int i=0; i<age.length; i++){
            if(age[i]<=0){
                System.out.println("Student "+(i+1)+" invalid age entered");
            }
            else if(age[i]>=18){
                System.out.println("Student "+(i+1)+" eligible");
            }
            else {
                System.out.println("Student " + (i+1) + " not eligible");
            }
        }
    }
}
