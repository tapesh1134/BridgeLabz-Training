import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a date (YYYY-MM-DD): ");
		String inputDate = scanner.nextLine();
		LocalDate date = LocalDate.parse(inputDate);
		LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
		LocalDate finalDate = updatedDate.minusWeeks(3);
		System.out.printf("Input date: %s%n", date);
		System.out.printf("After adding 7 days, 1 month, and 2 years: %s%n", updatedDate);
		System.out.printf("After subtracting 3 weeks: %s", finalDate);
		scanner.close();
	}
}
