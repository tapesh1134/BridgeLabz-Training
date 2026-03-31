
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface TransportService {

    void printServiceDetails();

}

interface GeoUtils {

    static int calculateDistance(List<Integer> stops, int start, int end) {
        int distance = 0;
        for (int i = start - 1; i < end; i++) {
            distance += stops.get(i);
        }
        return distance;
    }
}

interface FareCalculator {

    double calculateFare(int distance);
}

interface EmergencyService {

}



class BusService implements TransportService, FareCalculator {

    private String name;
    private LocalDateTime departureTime;
    private double fare;

    public BusService(String name, LocalDateTime departureTime, double fare) {
        this.name = name;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public double calculateFare(int distance) {
        return distance * fare;
    }

    @Override
    public void printServiceDetails() {
        System.out.println("\nName: " + name + " Departure time :" + departureTime + " Fare: " + fare);
    }
}

class TaxiService implements TransportService, FareCalculator {

    private String name;
    private LocalDateTime departureTime;
    private double fare;

    public TaxiService(String name, LocalDateTime departureTime, double fare) {
        this.name = name;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getName() {
        return name;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public double calculateFare(int distance) {
        return distance * fare;
    }

    @Override
    public void printServiceDetails() {
        System.out.println("\nName: " + name + " Departure time :" + departureTime + " Fare: " + fare);
    }
}

class MetroService implements TransportService, FareCalculator {

    private String name;
    private LocalDateTime departureTime;
    private double fare;

    public MetroService(String name, LocalDateTime departureTime, double fare) {
        this.name = name;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public double getFare() {
        return fare;
    }

    public double calculateFare(int distance) {
        return distance * fare;
    }

    @Override
    public void printServiceDetails() {
        System.out.println("\nName: " + name + " Departure time :" + departureTime + " Fare: " + fare);
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
        List<Integer> stops = Arrays.asList(10, 12, 4, 21, 36, 27);

        busServices.add(new BusService("Bus1", LocalDateTime.now(), 5.0));
        busServices.add(new BusService("Bus2", LocalDateTime.now().minusHours(1), 2.0));
        busServices.add(new BusService("Bus3", LocalDateTime.now().plusHours(1), 3.2));
        metroServices.add(new MetroService("Metro1", LocalDateTime.now().minusHours(1), 1.0));
        metroServices.add(new MetroService("Metro2", LocalDateTime.now(), 1.4));
        taxiServices.add(new TaxiService("Taxi1", LocalDateTime.now().plusHours(1), 8.9));
        taxiServices.add(new TaxiService("Taxi2", LocalDateTime.now(), 10.1));

        boolean run = true;

        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter ( 1 ) for Dashboard");
            System.out.println("Enter ( 2 ) for filter services");
            System.out.println("Enter ( 3 ) for booking");
            System.out.println("Exit ( -1 )");

            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("\nDashboard Details");
                    System.out.println("\n-----Bus service-----");
                    busServices.forEach(BusService::printServiceDetails);
                    System.out.println("\n-----Taxi service-----");
                    taxiServices.forEach(TaxiService::printServiceDetails);
                    System.out.println("\n-----Metro service-----");
                    metroServices.forEach(MetroService::printServiceDetails);
                    break;
                case 2:
                    System.out.print("Filter based on time or fare: ");
                    String based = scanner.next();
                    filter(busServices, metroServices, taxiServices, based);
                    System.out.println("\n-----Bus service-----");
                    busServices.forEach(BusService::printServiceDetails);
                    System.out.println("\n-----Taxi service-----");
                    taxiServices.forEach(TaxiService::printServiceDetails);
                    System.out.println("\n-----Metro service-----");
                    metroServices.forEach(MetroService::printServiceDetails);
                    break;
                case 3:
                    System.out.println("Select your transport type ( Bus, Metro, Taxi ):");
                    String transportType = scanner.next();
                    for (int i = 0; i < stops.size(); i++) {
                        System.out.println("Stop: " + (i + 1) + " distance: " + stops.get(i));
                    }
                    System.out.print("\nEnter your starting stop: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter your dropping stop: ");
                    int end = scanner.nextInt();

                    if (transportType.equals("Bus")) {
                        System.out.println("\n-----Bus service-----");
                        busServices.forEach(BusService::printServiceDetails);
                        System.out.println("\nSelect your transport number: ");
                        int transportNumber = scanner.nextInt();
                        BusService transportService = busServices.get(transportNumber - 1);
                        System.out.println("Total fare : " + transportService.calculateFare(GeoUtils.calculateDistance(stops, start, end)));
                    } else if (transportType.equals("Metro")) {
                        System.out.println("\n-----Metro service-----");
                        metroServices.forEach(MetroService::printServiceDetails);
                        System.out.println("\nSelect your transport number: ");
                        int transportNumber = scanner.nextInt();
                        MetroService transportService = metroServices.get(transportNumber - 1);
                        System.out.println("Total fare : " + transportService.calculateFare(GeoUtils.calculateDistance(stops, start, end)));
                    } else {
                        System.out.println("\n-----Taxi service-----");
                        taxiServices.forEach(TaxiService::printServiceDetails);
                        System.out.println("\nSelect your transport number: ");
                        int transportNumber = scanner.nextInt();
                        TaxiService transportService = taxiServices.get(transportNumber - 1);
                        System.out.println("Total fare : " + transportService.calculateFare(GeoUtils.calculateDistance(stops, start, end)));
                    }
                    break;
                case -1:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            scanner.close();
        }
    }
}
