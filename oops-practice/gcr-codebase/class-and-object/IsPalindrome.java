import java.util.Scanner;

class PalindromeChecker {
	String text;

	PalindromeChecker(String text) {
		this.text = text;

	}

	public boolean isPalindrome() {
		String cleantext = text.replaceAll("\\s", "").toLowerCase();
		String reverseText = new StringBuilder(cleantext).reverse().toString();
		return cleantext.equals(reverseText);
	}

	public void diplayResult() {
		System.out.printf("%s is %spalindrome", text, isPalindrome() ? "" : "not ");
	}
}

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = scanner.nextLine();
		PalindromeChecker pChecker = new PalindromeChecker(string);
		pChecker.diplayResult();
		scanner.close();
	}
}
