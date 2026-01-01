import java.util.*;

public class SortingComparison {
	public static long bubbleSort(int[] array) {
		long startTime = System.nanoTime();
		for (int i = 0; i < array.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}

			}
			if (!swapped)
				break;
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	public static long mergeSort(int[] array, int start, int end) {
		long startTime = System.nanoTime();
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);

			merge(array, start, mid, end);
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	public static void merge(int[] array, int start, int mid, int end) {
		List<Integer> list = new ArrayList<>();
		int i = start, j = mid + 1;
		while (i <= mid && j <= end) {
			if (array[i] <= array[j]) {
				list.add(array[i]);
				i++;
			} else {
				list.add(array[j]);
				j++;
			}
		}
		while (i <= mid) {
			list.add(array[i]);
			i++;
		}
		while (j <= end) {
			list.add(array[j]);
			j++;
		}

		for (int idx = 0; idx < list.size(); idx++) {
			array[idx + start] = list.get(idx);
		}
	}

	public static long quickSort(int[] array, int low, int high) {
		long startTime = System.nanoTime();
		if (low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		int array[] = { 73, 12, 45, 33, 90, 2, 88, 27, 59, 61, 6, 99, 38, 25, 77, 46, 1, 84, 53, 14, 67, 19, 36, 82, 7,
				48, 66, 97, 35, 100, 23, 17, 60, 5, 79, 94, 20, 70, 11, 41, 43, 10, 32, 4, 96, 24, 30, 21, 56, 9 };
		System.out.println("Bubble sort time: " + bubbleSort(array));
		System.out.println("Merge sort time: " + mergeSort(array, 0, array.length - 1));
		System.out.println("Quick sort time: " + quickSort(array, 0, array.length - 1));
	}
}