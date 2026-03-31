import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				isPrime = false;
			}
		}
		System.out.printf("Number is %sprime", isPrime ? "" : "not ");
		scanner.close();
	}
}
