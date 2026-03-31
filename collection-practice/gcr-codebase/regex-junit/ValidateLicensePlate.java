
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {

    private static final String REGEX = "^[A-Z]{2}\\d{4}$";
    private final Pattern pattern = Pattern.compile(REGEX);

    public boolean validate(String numberPlate) {
        Matcher matcher = pattern.matcher(numberPlate);
        return matcher.matches();
    }
}

public class ValidateLicensePlate {

    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number Plate: ");
        String numberPlate = scanner.next().toUpperCase();
        System.out.printf("%s is %s valid number plate%n", numberPlate, validator.validate(numberPlate) ? "a" : "not a");
        scanner.close();
    }
}
