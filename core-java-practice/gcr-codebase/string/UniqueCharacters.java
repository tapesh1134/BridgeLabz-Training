import java.util.Scanner;

public class UniqueCharacters {
	public static int getLength(String str) {
		int length = 0;
		try {
			while (true) {
				str.charAt(length);
				length++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return length;
	}

	public static char[] uniqueChar(String text) {
		int len = getLength(text);

		char[] temp = new char[len];
		int uniqueCount = 0;

		for (int i = 0; i < len; i++) {
			char current = text.charAt(i);
			boolean isUnique = true;
			for (int j = 0; j < i; j++) {
				if (current == text.charAt(j)) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				temp[uniqueCount++] = current;
			}
		}

		char[] result = new char[uniqueCount];
		for (int i = 0; i < uniqueCount; i++) {
			result[i] = temp[i];
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		char[] uniqueChars = uniqueChar(input);

		System.out.println("Unique characters in the string:");
		for (char ch : uniqueChars) {
			System.out.print(ch + " ");
		}

		scanner.close();
	}
}
