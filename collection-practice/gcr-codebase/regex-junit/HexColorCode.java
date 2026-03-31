
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {

    private String regex = "#[0-9A-Fa-f]{6}";
    Pattern pattern = Pattern.compile(regex);

    public boolean validate(String color) {
        Matcher matcher = pattern.matcher(color);
        return matcher.matches();
    }
}

public class HexColorCode {

    public static void main(String[] args) {
        Validator hexColor = new Validator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hex color code: ");
        String color = scanner.next();
        System.out.printf("%s is %s valid hex color code.", color, hexColor.validate(color) ? "a" : "not a");
        scanner.close();
    }
}
