
import java.util.Scanner;
import java.util.regex.*;

public class ExtractCapitalizedWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group());
            if (matcher.hitEnd() == false) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
