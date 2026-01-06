
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Character> hs = new LinkedHashSet();
        System.out.println("Enter a String: ");
        String str = sc.next();
        for (char c : str.toCharArray()) {
            hs.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : hs) {
            sb.append(c);
        }
        System.out.println("String after remove all duplicates: " + sb.toString());
        sc.close();
    }
}
