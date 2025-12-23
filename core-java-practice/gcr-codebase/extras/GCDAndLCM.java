import java.util.Scanner;

public class GCDAndLCM {
	public static int GCD(int a, int b) {
		while (b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}
		return a;
	}

	public static int LCM(int a, int b) {
		return (a * b) / GCD(a, b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		int gcd = GCD(num1, num2);
		int lcm = LCM(num1, num2);
		System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
		System.out.printf("LCM of %d and %d is: %d", num1, num2, lcm);
		scanner.close();
	}
}
