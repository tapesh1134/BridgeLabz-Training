import java.util.Scanner;

public class CharArrayComparision {
	public static char[] helper(String str) {
		char[] characterArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			characterArray[i] = str.charAt(i);
		}
		return characterArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String mainString = scanner.next();
		char[] characterArray = helper(mainString);
		char[] charArray = mainString.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.printf("Character from method is %s and function is %s are %s%n", charArray[i],
					characterArray[i], charArray[i] == characterArray[i] ? "equal" : "not equal");
		}
		scanner.close();
	}
}
