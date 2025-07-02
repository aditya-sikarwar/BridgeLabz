public class Vehicle {
    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid object. Not a Vehicle.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car", "KA01AB1234");
        Vehicle v2 = new Vehicle("Mary", "Bike", "KA02CD5678");

        v1.displayDetails(v1);
        v2.displayDetails(v2);

        Vehicle.updateRegistrationFee(6000);
    }
}
