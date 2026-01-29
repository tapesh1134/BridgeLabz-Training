
interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

public class LogisticApp {

    public static void main(String[] args) {
        double distanceKM = 120.0;
        double weightKG = 100;

        System.out.println(UnitConverter.kmToMiles(distanceKM));
        System.out.println(UnitConverter.kgToLbs(weightKG));
    }
}
