// Superclass
class Device {
    String deviceId;
    String status;  // e.g., "ON", "OFF"

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH-101", "ON", 22.5);

        thermostat.displayStatus();
        }    }