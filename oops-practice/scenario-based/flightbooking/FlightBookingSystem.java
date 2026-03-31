
import java.util.*;

public class FlightBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isFind;

        Flight[] flights = {
            new Flight(101, "Air India", "Delhi", "Mumbai", 180),
            new Flight(102, "IndiGo", "Delhi", "Bangalore", 200),
            new Flight(103, "SpiceJet", "Mumbai", "Goa", 400)
        };

        List<Booking> bookings = new ArrayList<>();

        while (true) {
            System.out.println("\nFlight Booking System");
            System.out.println("1. Display Flights");
            System.out.println("2. Search Flight");
            System.out.println("3. Book Flight");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Flight flight : flights) {
                        System.out.println(
                                "ID :- " + flight.getPlaneId()
                                + "\nName :- " + flight.getPlaneName()
                                + "\nSource :- " + flight.getSource()
                                + "\nDestination :- " + flight.getDestination()
                        );
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = sc.nextLine();

                    isFind = false;
                    for (Flight flight : flights) {
                        if (flight.getDestination().equalsIgnoreCase(destination)) {
                            flight.displayInfo();
                            isFind = true;
                        }
                    }
                    if (!isFind) {
                        System.out.println("Flight not available.");
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter destination: ");
                    String dest = sc.nextLine();

                    isFind = false;
                    for (Flight flight : flights) {
                        if (flight.getDestination().equalsIgnoreCase(dest)) {
                            isFind = true;

                            System.out.print("Enter User Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter User ID: ");
                            int id = sc.nextInt();

                            Booking booking = new Booking(
                                    flight.getPlaneId(),
                                    flight.getPlaneName(),
                                    flight.getSource(),
                                    flight.getDestination(),
                                    flight.getDistance(),
                                    id,
                                    name,
                                    12
                            );

                            bookings.add(booking);
                            booking.displayInfo();
                            break;
                        }
                    }

                    if (!isFind) {
                        System.out.println("Flight not available.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
