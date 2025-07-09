// Superclass
class Person {
    String name; int id;
    Person(String name, int id) { this.name = name; this.id = id; }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1
class Chef extends Person implements Worker {
    Chef(String name, int id) { super(name, id); }
    public void performDuties() {
        System.out.println("Cooking dishes in the kitchen.");
    }
}

// Subclass 2
class Waiter extends Person implements Worker {
    Waiter(String name, int id) { super(name, id); }
    public void performDuties() {
        System.out.println("Serving food to customers.");
    }
}

// Test
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Mike", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
