import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int digit = 0;
		while (number > 0) {
			number /= 10;
			digit++;
		}
		System.out.printf("Number of digits number is %d", digit);
		scanner.close();
	}
}
