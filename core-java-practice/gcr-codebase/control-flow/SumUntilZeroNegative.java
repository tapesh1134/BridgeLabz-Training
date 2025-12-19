import java.util.Scanner;

public class SumUntilZeroNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0.0;
		while (true) {
			System.out.print("Enter a number and enter zero for stop: ");
			double input = scanner.nextDouble();
			total += input;
			if (input <= 0) {
				break;
			}
		}
		System.out.printf("Total sum: %.2f", total);
		scanner.close();
	}

}
