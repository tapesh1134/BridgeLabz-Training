
import java.util.*;

public class longestpalindromicsubstring {

    public static boolean ispalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int len = 1;
        String sub = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + len; j <= s.length(); j++) {
                if (j - i > len && ispalindrom(s.substring(i, j))) {
                    len = j - i;
                    sub = s.substring(i, j);
                }
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Longest Palindromic Substring: " + longestPalindrome(str));
    }
}
