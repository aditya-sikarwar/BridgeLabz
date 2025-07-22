import java.util.*;

// Abstract base class for all checkpoints
abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    double expectedDuration;
    double actualDuration;

    Checkpoint(String id, String loc, double dist, double expected, double actual) {
        this.checkpointId = id;
        this.locationName = loc;
        this.distanceFromLast = dist;
        this.expectedDuration = expected;
        this.actualDuration = actual;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    abstract boolean isCritical();
    abstract String getType();
    abstract double calculatePenalty();

    public String toString() {
        String status = isDelayed() ? "Delayed" : "On Time";
        return getType() + " - " + locationName + " - " + status + " - Penalty: " + calculatePenalty();
    }
}

class DeliveryCheckpoint extends Checkpoint {
    DeliveryCheckpoint(String id, String loc, double dist, double expected, double actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() { return true; }
    String getType() { return "DeliveryCheckpoint"; }
    double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2 : 0;
    }
}

class FuelCheckpoint extends Checkpoint {
    FuelCheckpoint(String id, String loc, double dist, double expected, double actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() { return true; }
    String getType() { return "FuelCheckpoint"; }
    double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}

class RestCheckpoint extends Checkpoint {
    RestCheckpoint(String id, String loc, double dist, double expected, double actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() { return false; }
    String getType() { return "RestCheckpoint"; }
    double calculatePenalty() {
        return isDelayed() && (actualDuration - expectedDuration) > 30 ? (actualDuration - expectedDuration) * 0.5 : 0;
    }
}

class RouteNode<T extends Checkpoint> {
    T checkpoint;
    RouteNode<T> next;

    RouteNode(T checkpoint) {
        this.checkpoint = checkpoint;
    }
}

class RouteLinkedList<T extends Checkpoint> {
    private RouteNode<T> head;

    void addCheckpoint(T checkpoint) {
        RouteNode<T> newNode = new RouteNode<>(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            RouteNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;
        if (head.checkpoint.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }
        RouteNode<T> current = head;
        while (current.next != null) {
            if (current.next.checkpoint.checkpointId.equals(checkpointId)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    T findCheckpoint(String checkpointId) {
        RouteNode<T> current = head;
        while (current != null) {
            if (current.checkpoint.checkpointId.equals(checkpointId)) {
                return current.checkpoint;
            }
            current = current.next;
        }
        return null;
    }

    double computeTotalDistance() {
        double total = 0;
        RouteNode<T> current = head;
        while (current != null) {
            total += current.checkpoint.distanceFromLast;
            current = current.next;
        }
        return total;
    }

    double computeTotalPenalty() {
        double total = 0;
        RouteNode<T> current = head;
        while (current != null) {
            total += current.checkpoint.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    void printRoute() {
        RouteNode<T> current = head;
        int count = 1;
        while (current != null) {
            System.out.println(count++ + ". " + current.checkpoint);
            current = current.next;
        }
    }

    boolean checkCriticalConsistency() {
        boolean hasDelivery = false, hasFuel = false;
        RouteNode<T> current = head;
        while (current != null) {
            if (current.checkpoint instanceof DeliveryCheckpoint) hasDelivery = true;
            if (current.checkpoint instanceof FuelCheckpoint) hasFuel = true;
            current = current.next;
        }
        return hasDelivery && hasFuel;
    }
}

class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory = new RouteLinkedList<>();

    Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " - " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;
        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);
        System.out.println("Critical Route Check: " + (routeHistory.checkCriticalConsistency() ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}

class RouteTrackerSystem{
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        driver.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 10, 10));
        driver.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 40, 60, 95));
        driver.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 45, 60));

        driver.printSummary();
    }
}
