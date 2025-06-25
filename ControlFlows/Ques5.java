import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
             System.out.println(counter);
             --counter;
        }
        sc.close();
    }
} 