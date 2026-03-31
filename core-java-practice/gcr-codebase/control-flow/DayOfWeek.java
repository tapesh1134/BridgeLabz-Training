import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {

		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter month: ");
		int month = scanner.nextInt();

		System.out.print("Enter day: ");
		int day = scanner.nextInt();

		System.out.print("Enter year: ");
		int year = scanner.nextInt();

		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;

		System.out.printf("Day of week %s", days[d]);

		scanner.close();
	}
}
