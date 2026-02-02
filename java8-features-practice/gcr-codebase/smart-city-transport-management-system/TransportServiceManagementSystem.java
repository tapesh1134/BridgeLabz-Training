
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface TransportService {

    void printServiceDetails();

}

interface GeoUtils {

    static int calculateDistance() {
        return 10;
    }
}

interface FareCalculator {

    int calculateFare();
}

interface EmergencyService {

}

class BusService implements TransportService {

    private LocalDateTime departureTime;
    private double fare;

    public BusService(LocalDateTime departureTime, double fare) {
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public double getFare() {
        return fare;
    }

    public void printServiceDetails() {
        System.out.println("\nDeparture time :" + departureTime + " Fare: " + fare);
    }
}

class TaxiService implements TransportService {

    private LocalDateTime departureTime;
    private double fare;

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public double getFare() {
        return fare;
    }

    public TaxiService(LocalDateTime departureTime, double fare) {
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public void printServiceDetails() {
        System.out.println("\nDeparture time :" + departureTime + " Fare: " + fare);
    }
}

class MetroService implements TransportService {

    private LocalDateTime departureTime;
    private double fare;

    public MetroService(LocalDateTime departureTime, double fare) {
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public double getFare() {
        return fare;
    }

    public void printServiceDetails() {
        System.out.println("\nDeparture time :" + departureTime + " Fare: " + fare);
    }
}

public class TransportServiceManagementSystem {

    public static void filter(List<BusService> busServices, List<MetroService> metroServices, List<TaxiService> taxiServices, String based) {
        if (based.equals("time")) {
            metroServices.sort((t1, t2) -> t1.getDepartureTime().compareTo(t2.getDepartureTime()));
            busServices.sort((t1, t2) -> t1.getDepartureTime().compareTo(t2.getDepartureTime()));
            taxiServices.sort((t1, t2) -> t1.getDepartureTime().compareTo(t2.getDepartureTime()));
        } else if (based.equals("fare")) {
            busServices.sort((t1, t2) -> Double.compare(t1.getFare(), t2.getFare()));
            metroServices.sort((t1, t2) -> Double.compare(t1.getFare(), t2.getFare()));
            taxiServices.sort((t1, t2) -> Double.compare(t1.getFare(), t2.getFare()));
        }
    }

    public static void main(String[] args) {

        List<BusService> busServices = new ArrayList<>();
        List<MetroService> metroServices = new ArrayList<>();
        List<TaxiService> taxiServices = new ArrayList<>();

        busServices.add(new BusService(LocalDateTime.now(), 100.0));
        metroServices.add(new MetroService(LocalDateTime.now(), 20.0));
        taxiServices.add(new TaxiService(LocalDateTime.now(), 200.0));

        boolean run = true;

        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter ( 1 ) for filter services");
            System.out.println("Exit ( -1 )");

            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.print("Filter based on time or fare: ");
                    String based = scanner.next();
                    filter(busServices, metroServices, taxiServices, based);
                    System.out.println("Bus service");
                    for (BusService busService : busServices) {
                        busService.printServiceDetails();
                    }
                    System.out.println("Taxi service");
                    for (TaxiService taxiService : taxiServices) {
                        taxiService.printServiceDetails();
                    }
                    System.out.println("Metro service");
                    for (MetroService metroService : metroServices) {
                        metroService.printServiceDetails();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
