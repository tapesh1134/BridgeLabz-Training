import java.util.Arrays;

public class SortStudentMarks {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] marks = { 64, 34, 53, 90 };
		System.out.println("Marks before sorting: " + Arrays.toString(marks));
		bubbleSort(marks);
		System.out.println("Marks after sorting: " + Arrays.toString(marks));
	}
}
