import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		if (year >= 1582) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
				System.out.printf("%d is a leap year", year);
			} else {
				System.out.printf("%d is not a leap year", year);
			}
		} else {
			System.out.println("Enter a valid year");
		}
		scanner.close();
	}
}
