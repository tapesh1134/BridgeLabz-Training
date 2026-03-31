import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		int originalNumber = number;
		int digit = (int) Math.log10(number) + 1;

		while (originalNumber != 0) {
			sum += Math.pow(originalNumber % 10, digit);
			originalNumber = originalNumber / 10;
		}

		System.out.printf("%s", sum == number ? "Number is Armstrong" : "Number is not Armstrong");
		scanner.close();
	}
}
