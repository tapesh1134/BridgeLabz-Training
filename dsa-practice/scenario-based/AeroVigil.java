
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class InvalidFlightException extends Exception {

    public InvalidFlightException(String message) {
        super(message);
    }
}

class FlightUtil {

    Map<String, Integer> flightMap;
    Map<String, Double> fuelMap;

    public FlightUtil() {
        flightMap = new HashMap<>();
        flightMap.put("spicejet", 396);
        flightMap.put("vistara", 615);
        flightMap.put("indigo", 230);
        flightMap.put("air arabia", 130);

        fuelMap = new HashMap<>();
        fuelMap.put("spicejet", 200000.00);
        fuelMap.put("vistara", 300000.00);
        fuelMap.put("indigo", 250000.00);
        fuelMap.put("air arabia", 150000.00);
    }

    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
        String FLIGHT_NUMBER_REGEX = "^FL-+[0-9]{4}$";
        if (Integer.parseInt(flightNumber.split("-")[1]) > 1000 && flightNumber.matches(FLIGHT_NUMBER_REGEX)) {
            return true;
        } else {
            throw new InvalidFlightException("the flight number " + flightNumber + " is invalid");
        }
    }

    public boolean validateFlightName(String flightName) throws InvalidFlightException {
        if (flightMap.keySet().contains(flightName.toLowerCase())) {
            return true;
        } else {
            throw new InvalidFlightException("The flight name " + flightName + " is invalid");
        }
    }

    public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
        if (flightMap.get(flightName.toLowerCase()) >= passengerCount) {
            return true;
        } else {
            throw new InvalidFlightException("the passenger count " + passengerCount + " is invalid for " + flightName);
        }
    }

    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
        if (currentFuelLevel >= 0 && currentFuelLevel <= fuelMap.get(flightName.toLowerCase())) {
            return fuelMap.get(flightName.toLowerCase()) - currentFuelLevel;
        } else {
            throw new InvalidFlightException("invalid fuel levels for " + flightName);
        }
    }
}

public class AeroVigil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flight details");
        String details[] = sc.next().split(":");
        FlightUtil flightUtil = new FlightUtil();
        try {
            flightUtil.validateFlightNumber(details[0]);
            flightUtil.validateFlightName(details[1]);
            flightUtil.validatePassengerCount(Integer.parseInt(details[2]), details[1]);
            System.out.println("Fuel required to fill the tank: " + flightUtil.calculateFuelToFillTank(details[1], Double.parseDouble(details[3])) + " litres");
        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
