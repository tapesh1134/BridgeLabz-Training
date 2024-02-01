
import java.util.Arrays;
import java.util.List;

public class EmailNotification {
    public static void sendEmailNotification(String name){
        System.out.println("Successfully send notification to " + name);
    }

    public static void main(String[] args) {
        List<String> users = Arrays.asList("Amit","Raj","Rohan");
        users.stream()
            .forEach(n -> sendEmailNotification(n));
    }
}
