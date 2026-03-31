import java.util.Scanner;

public class AbundantNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i < number; i++) {
			sum += number % i == 0 ? i : 0;
		}
		System.out.printf("%d is %s Abundant number", number, sum > number ? "a" : "not a");
		scanner.close();
	}
}
