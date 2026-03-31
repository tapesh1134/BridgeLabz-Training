import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String string = "Java";
		HashSet<Character> hs = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			hs.add(string.charAt(i));
		}
		for(char c : hs) {
			sb.append(c);
		}
		System.out.println("Main string: " + string);
		System.out.println("Without duplicates: " + sb.reverse().toString());
	}
}
