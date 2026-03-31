import java.util.Arrays;

public class ExamScores {
	public static void selectionSort(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[j] < scores[minIndex]) {
					minIndex = j;
				}
			}
			int temp = scores[minIndex];
			scores[minIndex] = scores[i];
			scores[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] scores = { 78, 92, 85, 64, 90 };
		System.out.println("Scores before Sorting: " + Arrays.toString(scores));
		selectionSort(scores);
		System.out.println("Scores after Sorting: " + Arrays.toString(scores));
	}
}
