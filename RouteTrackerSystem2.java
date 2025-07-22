import java.util.*;

// Abstract base class
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

class Driver {
    String driverId;
    String name;
    List<Checkpoint> routeHistory = new ArrayList<>();

    Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
    }

    void addCheckpoint(Checkpoint cp) {
        routeHistory.add(cp);
    }

    boolean removeCheckpoint(String checkpointId) {
        return routeHistory.removeIf(cp -> cp.checkpointId.equals(checkpointId));
    }

    Checkpoint findCheckpoint(String checkpointId) {
        for (Checkpoint cp : routeHistory) {
            if (cp.checkpointId.equals(checkpointId)) return cp;
        }
        return null;
    }

    double computeTotalDistance() {
        double total = 0;
        for (Checkpoint cp : routeHistory) {
            total += cp.distanceFromLast;
        }
        return total;
    }

    double computeTotalPenalty() {
        double total = 0;
        for (Checkpoint cp : routeHistory) {
            total += cp.calculatePenalty();
        }
        return total;
    }

    boolean checkCriticalConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;
        for (Checkpoint cp : routeHistory) {
            if (cp instanceof DeliveryCheckpoint) hasDelivery = true;
            if (cp instanceof FuelCheckpoint) hasFuel = true;
        }
        return hasDelivery && hasFuel;
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " - " + name);
        System.out.println("Route Summary:");
        int i = 1;
        for (Checkpoint cp : routeHistory) {
            System.out.println(i++ + ". " + cp);
        }
        double totalDistance = computeTotalDistance();
        double totalPenalty = computeTotalPenalty();
        double score = totalDistance - totalPenalty;
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + score);
        System.out.println("Critical Route Check: " + (checkCriticalConsistency() ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}

public class RouteTrackerSystem2{
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Vikram Aditya");

        driver.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        driver.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 10, 10));
        driver.addCheckpoint(new RestCheckpoint("C3", "Motel X", 40, 60, 95));
        driver.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 45, 60));

        driver.printSummary();
    }
}
