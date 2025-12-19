import java.util.Scanner;

public class IsSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		System.out.print("Enter third number: ");
		int num3 = scanner.nextInt();
		System.out.printf("Is the first number the smallest? %s", num1 < num2 ? num1 < num3 ? "Yes" : "No" : "No");
		scanner.close();
	}

}
