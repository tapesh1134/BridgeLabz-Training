import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] heights = new double[11];
		System.out.println("Enter height of 11 players:");
		for (int i = 0; i < heights.length; i++) {
			heights[i] = scanner.nextDouble();
		}
		double sum = 0;
		for (double i : heights) {
			sum += i;
		}
		System.out.printf("Mean height of 11 is %.2f", sum / 11);
		scanner.close();
	}
}
