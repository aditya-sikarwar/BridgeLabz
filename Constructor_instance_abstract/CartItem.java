import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " x" + quantity + " = ₹" + getTotal());
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(CartItem item) {
        cart.add(item);
        System.out.println("Added: " + item.itemName);
    }

    void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println("Removed: " + itemName);
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotal();
        }
        System.out.println("Total Cart Cost: ₹" + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 50000, 1));
        cart.addItem(new CartItem("Mouse", 1500, 2));
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
