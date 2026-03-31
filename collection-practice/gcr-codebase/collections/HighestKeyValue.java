import java.util.HashMap;

public class HighestKeyValue {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 60);
		map.put("C", 40);
		map.put("D", 30);
		String highest = "";
		int highestValue = 0;
		for (String str : map.keySet()) {
			if (map.get(str) > highestValue) {
				highest = str;
				highestValue = map.get(str);
			}
		}
		System.out.println("Map: " + map);
		System.out.println("Key with highest value: " + highest);
	}
}
