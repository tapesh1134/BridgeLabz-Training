
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static List<CreatorStats> EngagementBoard;

    public Program() {
        EngagementBoard = new ArrayList<>();
    }

    public void RegisterCreator(CreatorStats record) {
        EngagementBoard.add(record);
    }

    public Map<String, Integer> GetTopPostCount(List<CreatorStats> records, double likeThreshold) {
        Map<String, Integer> weeklyLikeMap = new HashMap<>();
        for (CreatorStats creatorStats : records) {
            for (double likes : creatorStats.weaklyLikes) {
                if (likes > likeThreshold) {
                    weeklyLikeMap.put(creatorStats.creatorName, weeklyLikeMap.getOrDefault(creatorStats.creatorName, 0) + 1);
                }
            }
        }
        return weeklyLikeMap;
    }

    public List<Double> CalculateAverageLikes() {
        List<Double> averageLikes = new ArrayList<>();
        for (CreatorStats creatorStats : EngagementBoard) {
            double averageLike = 0.0;
            for (double likes : creatorStats.weaklyLikes) {
                averageLike += likes;
            }
            averageLike /= creatorStats.weaklyLikes.length;
            averageLikes.add(averageLike);
        }
        return averageLikes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        Program program = new Program();

        while (running) {
            System.out.println("\n1. Register Creator");
            System.out.println("2. View Top Performing Posts");
            System.out.println("3. View Overall Average Weekly Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Creator Name: ");
                    String creatorName = sc.nextLine();

                    double[] weeklyLikes = new double[4];
                    for (int i = 0; i < 4; i++) {
                        System.out.print("Enter likes for week " + (i + 1) + ": ");
                        weeklyLikes[i] = sc.nextDouble();
                    }
                    program.RegisterCreator(new CreatorStats(creatorName, weeklyLikes));

                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.print("Enter like threshold: ");
                    int likeThreshold = sc.nextInt();
                    Map<String, Integer> topCreators = program.GetTopPostCount(EngagementBoard, likeThreshold);
                    if (topCreators.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for (Map.Entry<String, Integer> entry : topCreators.entrySet()) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    List<Double> average = program.CalculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + average);
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();

    }
}
