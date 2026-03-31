import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ZeroSubarraySumFinder {
	public List<int[]> findSubarrays(int[] arr) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<int[]> result = new ArrayList<>();
		int sum = 0;
		map.put(0, new ArrayList<>());
		map.get(0).add(-1);

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (map.containsKey(sum)) {
				for (int index : map.get(sum)) {
					result.add(new int[] { index + 1, i });
				}
			}
			map.putIfAbsent(sum, new ArrayList<>());
			map.get(sum).add(i);
		}
		return result;
	}
}

public class ZeroSubarraySum {
	public static void main(String[] args) {
		int[] arr = {4, -2, -2, 2, 1, -3, 3};
		ZeroSubarraySumFinder finder = new ZeroSubarraySumFinder();
		List<int[]> subarray = finder.findSubarrays(arr);
		for (int[] range : subarray) {
            System.out.printf("Start: %d, End: %d%n", range[0], range[1]);
        }
	}
}