public class ReverseString {
	public static void main(String[] args) {
		String string = "Java is powerful language";
		StringBuilder sb = new StringBuilder();
		String reversedString = sb.append(string).reverse().toString();
		System.out.println("Before reverse: " + string);
		System.out.println("After reverse: " + reversedString);
	}
}
