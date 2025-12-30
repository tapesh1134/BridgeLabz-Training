import java.util.HashMap;
import java.util.Map;

public class PairSum {
	public static boolean hasPairSum(int[] arr, int target) {
		Map<Integer, Boolean> map = new HashMap<>();

		for (int num : arr) {
			int required = target - num;

			if (map.containsKey(required)) {
				return true;
			}
			map.put(num, true);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 3, 1, 6, 9 };
		int target = 10;
		System.out.println(hasPairSum(arr, target));
	}
}