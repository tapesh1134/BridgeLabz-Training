import java.util.Scanner;

public class CharacterFrequency {
	public static String[][] findCharFreq(String text) {
		int[] freq = new int[256];
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			freq[ch]++;
		}

		int unique = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (freq[ch] > 0) {
				unique++;
				// Convert to negative to mark counted
				freq[ch] = -freq[ch];
			}
		}

		String[][] result = new String[unique][2];
		int index = 0;

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if (freq[ch] < 0) {
				result[index][0] = String.valueOf(ch);
				result[index][1] = String.valueOf(-freq[ch]);
				freq[ch] = 0;
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String[][] freq = findCharFreq(input);
		System.out.println("Character Frequency");
		for (int i = 0; i < freq.length; i++) {
			System.out.println(freq[i][0] + "\t" + freq[i][1]);
		}

		scanner.close();
	}
}
