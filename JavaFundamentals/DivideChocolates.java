import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        int eachChildGets = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + eachChildGets + " and the number of remaining chocolates is " + remaining);
    }
}
