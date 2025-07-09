// Base class
class Order {
    String orderId, orderDate;
    Order(String orderId, String orderDate) {
        this.orderId = orderId; this.orderDate = orderDate;
    }
    String getOrderStatus() { return "Order placed on " + orderDate; }
}

// First subclass
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); this.trackingNumber = trackingNumber;
    }
    @Override String getOrderStatus() { return "Shipped, Tracking #: " + trackingNumber; }
}

// Second subclass
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); this.deliveryDate = deliveryDate;
    }
    @Override String getOrderStatus() { return "Delivered on " + deliveryDate; }
}

// Test
public class OrderManagementSystem {
    public static void main(String[] args) {
        Order o = new Order("O1", "2025-07-01");
        ShippedOrder s = new ShippedOrder("O2", "2025-07-01", "TRK123");
        DeliveredOrder d = new DeliveredOrder("O3", "2025-06-30", "TRK456", "2025-07-02");

        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
