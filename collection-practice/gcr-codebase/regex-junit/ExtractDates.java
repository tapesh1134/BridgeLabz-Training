
import java.util.Scanner;
import java.util.regex.*;

public class ExtractDates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group());
            if (!matcher.hitEnd()) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
