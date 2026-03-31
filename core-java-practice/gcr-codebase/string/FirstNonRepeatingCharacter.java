import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		char result = ' ';
		int[] freq = new int[256];

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			freq[ch]++;
		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (freq[ch] == 1) {
				result = ch;
			}
		}

		if (result != ' ') {
			System.out.println("First non-repeating character: " + result);
		} else {
			System.out.println("No non-repeating character found.");
		}

		scanner.close();
	}
}
