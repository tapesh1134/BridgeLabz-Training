import java.util.Arrays;

public class SortEmployeeId {
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] ids = { 5, 4, 3, 7, 6, 1, 8, 9, 2 };
		System.out.println("IDs before sorting: " + Arrays.toString(ids));
		insertionSort(ids);
		System.out.println("IDs after sorting: " + Arrays.toString(ids));
	}
}
