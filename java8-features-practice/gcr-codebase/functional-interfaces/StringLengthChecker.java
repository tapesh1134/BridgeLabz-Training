
import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {
        int charLimit = 50;
        Function<String, Integer> messageLength = message -> message.length();
        String message = "This is a sample notification message";
        int length = messageLength.apply(message);
        if (length > charLimit) {
            System.out.println("Message exceeds char limit");
        } else {
            System.out.println("Message is in char limit");
        }
    }
}
