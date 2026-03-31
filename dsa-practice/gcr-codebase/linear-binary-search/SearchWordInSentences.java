public class SearchWordInSentences {

    public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful language",
            "Linear search is simple",
            "Data structures are important",
            "I love programming"
        };
        String word = "search";
        String result = searchSentence(sentences, word);
        System.out.println(result);
    }
}
