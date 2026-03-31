
import java.util.Random;

public class FootballTeamHeights {

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random random = new Random();
        System.out.println("Heights of Players (in cms):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
            System.out.print(heights[i] + " ");
        }
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);
        System.out.printf("\nShortest Height: %d cms%n", shortest);
        System.out.printf("Tallest Height: %d cms%n", tallest);
        System.out.printf("Mean Height: %.2f cms%n", mean);
    }
}
