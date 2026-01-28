
import java.util.Scanner;

public class FlipKey {

    public static String CleanseAndInvert(String str) {
        if (str.length() < 6) {
            return "invalid input";
        }
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (!(c >= 'a' && c <= 'z')) {
                return "invalid input";
            }
        }
        StringBuilder br = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            char c = arr[i];
            int ascii = (int) c;
            if (ascii % 2 != 0) {
                if (br.length() % 2 == 0) {
                    br.append(Character.toUpperCase(c));
                } else {
                    br.append(c);
                }
            }
        }
        return "generated key is - " + br.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println(CleanseAndInvert(str));
        sc.close();
    }
}
