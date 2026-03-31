public class PeakElement {
	public static int findPeakElement(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int n = arr.length;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			boolean leftOk = (mid == 0) || arr[mid] > arr[mid - 1];
			boolean rightOk = (mid == n - 1) || arr[mid] > arr[mid + 1];
			if (leftOk && rightOk) {
				return mid;
			}
			if (mid > 0 && arr[mid] < arr[mid - 1]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 20, 4, 1, 0 };
		int index = findPeakElement(arr);
		System.out.println("Peak index: " + index);
		System.out.println("Peak element: " + arr[index]);
	}
}
