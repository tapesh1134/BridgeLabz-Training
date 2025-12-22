import java.util.Scanner;
import java.util.function.Function;

public class LengthOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String mainString = scanner.next();
		Function<String, Integer> lengthFunction = (str) -> {
			int length = 0;
			while (true) {
				try {
					str.charAt(length);
					length++;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					break;
				}
			}
			return length;
		};

		int calculatedLength = lengthFunction.apply(mainString);
		System.out.printf("Used-defined function length is %d and method length is %d", calculatedLength,
				mainString.length());
	}
}
