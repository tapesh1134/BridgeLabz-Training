
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class LexicalTwist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word :");
        String word1 = sc.nextLine().trim().toLowerCase();
        if (word1.contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return;
        }
        System.out.println("Enter the second word :");
        String word2 = sc.nextLine().trim().toLowerCase();
        if (word2.contains(" ")) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        if (reverse(word1, word2)) {
            System.out.println(vowelReplacement(word2));

        } else {
            String fullWord = word1 + word2;
            fullWord = fullWord.toUpperCase();
            int vowelCounter = vowelCount(fullWord);
            int consonantCounter = consonantCount(fullWord);
            if (vowelCounter > consonantCounter) {
                List<Character> vowelList = new ArrayList<>();
                for (char ch : vowelSet) {
                    vowelList.add(ch);
                }
                System.out.println(vowelList.get(0) + "" + vowelList.get(1) + "");

            } else if (consonantCounter > vowelCounter) {
                List<Character> consonantList = new ArrayList<>();
                for (char ch : consonantSet) {
                    consonantList.add(ch);
                }
                System.out.println(consonantList.get(0) + "" + consonantList.get(1) + "");
            } else {
                System.out.println("Vowels and consonants are equal");
            }

        }

    }

    public static boolean reverse(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        String reverseWord = "";
        for (int i = word2.length() - 1; i >= 0; i--) {
            reverseWord += word2.charAt(i);
        }
        if (!word1.equalsIgnoreCase(reverseWord)) {
            return false;
        }

        return true;
    }

    public static String vowelReplacement(String word2) {
        String ans = "";
        for (int i = 0; i < word2.length(); i++) {
            if (word2.charAt(i) == 'a' || word2.charAt(i) == 'e' || word2.charAt(i) == 'i' || word2.charAt(i) == 'o' || word2.charAt(i) == 'u') {
                ans += "@";
            } else {
                ans += word2.charAt(i);
            }
        }

        return ans;
    }

    public static LinkedHashSet<Character> vowelSet = new LinkedHashSet<>();
    public static LinkedHashSet<Character> consonantSet = new LinkedHashSet<>();

    public static int vowelCount(String str) {  // method to count vowels
        int vowelCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowelCounter++;
                vowelSet.add(str.charAt(i));
            }
        }
        return vowelCounter;

    }

    public static int consonantCount(String str) { // method to count consonants 
        int consonantCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U') {
                consonantCounter++;
                consonantSet.add(str.charAt(i));
            }
        }
        return consonantCounter;
    }
}
