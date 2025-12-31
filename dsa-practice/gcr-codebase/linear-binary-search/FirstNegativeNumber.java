public class FirstNegativeNumber {
	public static int findFirstNegative(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, -1, 4, -2, -5, 8 };
		int idx = findFirstNegative(numbers);
		if (idx == -1) {
			System.out.println("Negative number not found");
		} else {
			System.out.println("First negative number at idx: " + idx);
		}
	}
}