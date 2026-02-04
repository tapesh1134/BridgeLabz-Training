
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TransformingName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("raj","rohan","tapesh","ankit","sam");
        names.stream()
            .map(n -> n.toUpperCase())
            .sorted(Comparator.comparing(n -> n))
            .forEach(System.out::println);
    }
}
