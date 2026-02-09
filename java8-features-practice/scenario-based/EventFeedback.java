
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InvalidRatingException extends Exception {

    public InvalidRatingException(String message) {
        super(message);
    }
}

public class EventFeedback {

    public static void main(String[] args) throws InvalidRatingException {
        Map<Integer, List<Integer>> feedbackMap = new HashMap<>();
        feedbackMap.put(1, Arrays.asList(4, 2, 5, 2, 1, 2, 3, 4));
        feedbackMap.put(2, Arrays.asList(5, 2, 5, 1, 2));

        boolean invalidFeedback = feedbackMap.keySet().stream()
                .anyMatch(n -> feedbackMap.get(n).stream()
                .anyMatch(v -> v < 1 || v > 5)
                );

        if (invalidFeedback) {
            throw new InvalidRatingException("Invalid feedback");
        }

        for (int event : feedbackMap.keySet()) {
            System.out.println("Event Id: " + event);
            System.out.println("Average: " + feedbackMap.get(event).stream()
                    .mapToDouble(Integer::intValue)
                    .average()
                    .orElse(0));
        }
    }
}
