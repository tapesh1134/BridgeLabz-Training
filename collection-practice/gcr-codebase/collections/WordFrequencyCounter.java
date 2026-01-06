import java.util.HashMap;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		String input = "Hello world, hello Java!";
		input = input.toLowerCase();
		for (String str : input.split(" ")) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		System.out.print(map);
	}
}
