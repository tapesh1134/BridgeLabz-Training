
import java.util.*;

public class SearchingComparison {
	public static long linearSearch(int[] array, int target) {
		long startTime = System.nanoTime();
		for (int i = 0; i < array.length; i++) {
			if (target == array[i]) {
				break;
			}
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	public static long binarySearch(int[] array, int target) {
		Arrays.sort(array);
		int left = 0, right = array.length - 1;
		long startTime = System.nanoTime();
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				break;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		long endTime = System.nanoTime();
		return endTime - startTime;

	}

	public static void main(String[] args) {
		int array[] = { 73, 12, 45, 33, 90, 2, 88, 27, 59, 61, 6, 99, 38, 25, 77, 46, 1, 84, 53, 14, 67, 19, 36, 82, 7,
				48, 66, 97, 35, 100, 23, 17, 60, 5, 79, 94, 20, 70, 11, 41, 43, 10, 32, 4, 96, 24, 30, 21, 56, 9 };
		int target = 99;
		System.out.println("Linear Search time: " + linearSearch(array, target));
		System.out.println("Binary Search time: " + binarySearch(array, target));
	}
}