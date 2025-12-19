import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		int temp = number;
		while (temp != 0) {
			int digit = temp % 10;
			sum = sum + digit;
			temp = temp / 10;
		}
		System.out.printf("%d is %s Harshad number", number, number % sum == 0 ? "a" : "not a");
		scanner.close();
	}
}
