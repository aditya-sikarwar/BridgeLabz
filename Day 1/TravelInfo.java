import java.util.Scanner;

public class TravelInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter fromCity: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter viaCity: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter toCity: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from FromCity to ViaCity (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter distance from ViaCity to Final City (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter time from FromCity to ViaCity (in minutes): ");
        int timeFromToVia = scanner.nextInt();

        System.out.print("Enter time from ViaCity to Final City (in minutes): ");
        int timeViaToFinalCity = scanner.nextInt();

        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes");
    }
}
