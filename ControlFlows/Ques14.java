import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; --i) {
             System.out.println(i);
        }
        sc.close();
    }
} 