public class ConcatenateStrings {
    public static String concatenate(String[] arr) {
        StringBuffer buffer = new StringBuffer();
        for (String str : arr) {
            buffer.append(str);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        String[] words = { "Java", " ", "is", " ", "powerful" };
        String result = concatenate(words);
        System.out.println(result);
    }
}
