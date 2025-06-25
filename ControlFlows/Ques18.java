import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        int youngest = Math.min(Math.min(ageAmar, ageAkbar), ageAnthony);
        System.out.println("Youngest friend's age is: " + youngest);

        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();
        double tallest = Math.max(Math.max(heightAmar, heightAkbar), heightAnthony);
        System.out.println("Tallest friend's height is: " + tallest + " cm");
        sc.close();
    }
} 