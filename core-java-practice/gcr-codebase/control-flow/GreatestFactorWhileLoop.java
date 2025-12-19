import java.util.Scanner;

public class GreatestFactorWhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int greatestFactor = 1;
		int i = number - 1;
		while (i > 0) {
			if (number % i == 0) {
				greatestFactor = i;
				break;
			}
			i--;
		}
		System.out.printf("Greatest Factor for %d is %d", number, greatestFactor);
		scanner.close();
	}
}
