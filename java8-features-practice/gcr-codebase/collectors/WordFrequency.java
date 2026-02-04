
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequency {
    public static void main(String[] args) {
        String para = "This is a sample paragraph . This paragraph use for word frequency";

        Map<String, Integer> wordFreq = Stream
                .of(para.toLowerCase().split(" "))
                .collect(Collectors.toMap(n -> n, n -> 1, Integer::sum));

        System.out.println(wordFreq);
    }
}
