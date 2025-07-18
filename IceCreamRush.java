//IceCreamRush- sorting flavours by popularity
//8 flavous
//At the end of each week, Sort on the basis of how many times each was sold.
//repeatedly compares adjacent sales figures and swap them if needed.

import java.util.*;

public class IceCreamRush {

    public static void bubbleSort(int[] sales, String[] flavours) {
        int n = sales.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (sales[j] < sales[j + 1]) { // Descending order.
                    // Swap sales.
                    int tempSale = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSale;

                    // Swap flavours.
                    String tempFlavour = flavours[j];
                    flavours[j] = flavours[j + 1];
                    flavours[j + 1] = tempFlavour;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        String[] flavours = {
            "Chocolate", "Vanilla", "Strawberry", "Mango",
            "Butterscotch", "Pineapple", "Black Currant", "CoffeeToffee"
        };

        int[] sales = {56, 84, 42, 91, 86, 38, 74, 29}; // sales w.r.t flavours

        bubbleSort(sales, flavours);

        System.out.println("Flavours sorted by popularity:");
        for (int i = 0; i < flavours.length; i++) {
            System.out.println(flavours[i] + " - Sold: " + sales[i]);
        }
    }
}
