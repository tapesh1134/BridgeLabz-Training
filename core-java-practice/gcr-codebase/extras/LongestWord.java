import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine();
		String arr[] = input.split(" ");
		int longestIdx = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > arr[longestIdx].length()) {
				longestIdx = i;
			}
		}
		System.out.printf("Longest word in sentence is %s", arr[longestIdx]);
		scanner.close();
	}
}
