import java.util.Scanner;

public class ShortestLongestWord {
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

	public static String[] customSplit(String text) {
		int length = getLength(text);
		int wordCount = 1;
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				wordCount++;
			}
		}

		int[] spaceIndexes = new int[wordCount - 1];
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				spaceIndexes[index++] = i;
			}
		}

		String[] words = new String[wordCount];
		int start = 0;
		for (int i = 0; i < spaceIndexes.length; i++) {
			words[i] = text.substring(start, spaceIndexes[i]);
			start = spaceIndexes[i] + 1;
		}
		words[wordCount - 1] = text.substring(start);

		return words;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text: ");
		String input = scanner.nextLine();

		String[] words = customSplit(input);
		String[][] result = new String[words.length][2];
		for (int i = 0; i < words.length; i++) {
			int length = getLength(words[i]);
			result[i][0] = words[i];
			result[i][1] = String.valueOf(length);
		}
		int minIndex = 0;
		int maxIndex = 0;
		int minLen = Integer.parseInt(result[0][1]);
		int maxLen = Integer.parseInt(result[0][1]);

		for (int i = 1; i < result.length; i++) {
			int len = Integer.parseInt(result[i][1]);

			if (len < minLen) {
				minLen = len;
				minIndex = i;
			}

			if (len > maxLen) {
				maxLen = len;
				maxIndex = i;
			}
		}

		System.out.println("Shortest word: " + result[minIndex][0]);
		System.out.println("Longest word: " + result[maxIndex][0]);
		scanner.close();
	}
}
