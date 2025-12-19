import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		System.out.printf("If the number is positive, print %s",
				number <= 0 ? number == 0 ? "Zero" : "Negative" : "Positive");
		scanner.close();
	}
}
