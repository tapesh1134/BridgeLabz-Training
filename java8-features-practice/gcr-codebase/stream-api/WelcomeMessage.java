
import java.util.Arrays;
import java.util.List;

public class WelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Raj","Rohan","Ami");
        attendees.stream()
            .forEach(n-> System.out.println("Welcome " + n));
    }
}
