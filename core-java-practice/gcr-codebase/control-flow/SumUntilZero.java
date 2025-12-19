import java.util.Scanner;

public class SumUntilZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0.0;
		while (true) {
			System.out.print("Enter a number and enter zero for stop: ");
			double input = scanner.nextDouble();
			sum += input;
			if (input == 0) {
				break;
			}
		}
		System.out.printf("Total sum: %.2f", sum);
		scanner.close();
	}

}
