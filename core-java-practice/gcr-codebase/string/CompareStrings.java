import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String firstString = scanner.next();
		System.out.print("Enter second string: ");
		String secondString = scanner.next();
		boolean result = true;
		if (firstString.length() == secondString.length()) {
			for (int i = 0; i < firstString.length(); i++) {
				if (firstString.charAt(i) != secondString.charAt(i)) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		System.out.printf("Using charAt() strings are %s.%n", result ? "equal" : "not equal");
		System.out.printf("Using equals() string are %s.%n", firstString.equals(secondString) ? "equals" : "not equal");
		scanner.close();
	}
}
