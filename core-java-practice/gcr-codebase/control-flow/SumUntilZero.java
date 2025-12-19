import java.util.Scanner;

public class SumUntilZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("Enter a number and enter zero for stop: ");
			int input = scanner.nextInt();
			sum += input;
			if (input == 0) {
				break;
			}
		}
		System.out.printf("Total sum: %d", sum);
		scanner.close();
	}

}
