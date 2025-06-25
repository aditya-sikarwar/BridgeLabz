
import java.util.*;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] height = new int[3];
        int[] age = new int[3];

        
        System.out.println("Enter height for Amar, Akbar, Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }

        
        System.out.println("\nEnter age for Amar, Akbar, Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Age of " + names[i] + ": ");
            age[i] = sc.nextInt();
        }

        
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

    
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        
        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");

        
    }
}
