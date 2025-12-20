import java.util.Scanner;

public class ArraySumLimit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double[] number = new double[10];
		int index = 0;
		double sum = 0;
		while (true) {
			System.out.print("Enter a number (0 or negative to stop): ");
			double input = scanner.nextDouble();
			if (input <= 0 || index == 10) {
				break;
			}
			number[index] = input;
			index++;
		}
		System.out.println("Number Entered");
		for (double i : number) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("Sum of all numbers: " + sum);
		scanner.close();
	}
}
