
public class NullPointerException {
	public static void main(String[] args) {
//		String string = null;
//		System.out.println(string.length());
		try {
			String string = null;
			System.out.println(string.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
