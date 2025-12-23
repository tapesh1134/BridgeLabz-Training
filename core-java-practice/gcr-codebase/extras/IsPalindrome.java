import java.util.Scanner;

public class IsPalindrome {
	public static boolean checkPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt((str.length() - 1) - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = scanner.next();
		System.out.printf("%s is %s palindrom", string, checkPalindrome(string) ? "" : "not");
		scanner.close();
	}
}
