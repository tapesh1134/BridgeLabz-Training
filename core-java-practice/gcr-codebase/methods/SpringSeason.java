
import java.util.Scanner;

public class SpringSeason {

    public static boolean isSpring(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month > 3 && month < 6) {
            return true;
        }
        if (month == 3 && day >= 20) {
            return true;
        }
        if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day in month: ");
        int day = scanner.nextInt();
        System.out.println(isSpring(month, day) ? "Its a Spring Season" : "Not a Spring Season");
        scanner.close();
    }
}
