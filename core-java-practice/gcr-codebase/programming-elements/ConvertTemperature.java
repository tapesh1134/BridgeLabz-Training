
import java.util.*;

public class ConvertTemperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in degree:");
        // Formula: (0°C × 9/5) + 32 = 32°F
        int temperature = sc.nextInt();
        System.out.println("After conversion: " + (temperature * (9 / 5)) + 32);
        sc.close();
    }
}
