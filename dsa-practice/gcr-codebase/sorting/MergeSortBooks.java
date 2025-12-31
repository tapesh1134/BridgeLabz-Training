import java.util.Arrays;

public class MergeSortBooks {
	public static void mergeSort(int[] prices, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(prices, left, mid);
			mergeSort(prices, mid + 1, right);
			merge(prices, left, mid, right);
		}
	}

	public static void merge(int[] prices, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] l = new int[n1];
		int[] r = new int[n2];
		for (int i = 0; i < n1; i++) {			
			l[i] = prices[left + i];
		}
		for (int j = 0; j < n2; j++) {
			r[j] = prices[mid + 1 + j];			
		}

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (l[i] <= r[j]) {
				prices[k] = l[i];
				i++;
			} else {
				prices[k] = r[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			prices[k] = l[i];
			i++;
			k++;
		}

		while (j < n2) {
			prices[k] = r[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] bookPrices = { 450, 299, 799, 199, 599 };
		System.out.println("Before Sorting: " + Arrays.toString(bookPrices));
		mergeSort(bookPrices, 0, bookPrices.length - 1);
		System.out.println("After Sorting: " + Arrays.toString(bookPrices));
	}
}
