
import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {
        double threshold = 40.0;
        Predicate<Double> temperatureAlert = temperature -> temperature > threshold;
        double currentTemperature = 45.0;

        if (temperatureAlert.test(currentTemperature)) {
            System.out.println("Alert: temperature crossed threshold");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
