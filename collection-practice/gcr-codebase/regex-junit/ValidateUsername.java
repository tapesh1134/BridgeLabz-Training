
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {

    private String regex = "\\[a-zA-Z]\\w{4,14}";

    public boolean match(String userName) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }
}

public class ValidateUsername {

    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = scanner.next();
        System.out.printf("%s %s", userName, validator.match(userName) ? "is a valid username" : "is not a valid username");
        scanner.close();
    }
}
