import java.util.ArrayList;
import java.util.HashMap;

public class InvertMap {

	public static HashMap<Integer, ArrayList<String>> invertMap(HashMap<String, Integer> map) {
		HashMap<Integer, ArrayList<String>> invertedMap = new HashMap<>();
		for (String str : map.keySet()) {
			if (!invertedMap.containsKey(map.get(str))) {
				invertedMap.put(map.get(str), new ArrayList<>());
			}
			invertedMap.get(map.get(str)).add(str);
		}
		return invertedMap;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 2);
		map.put("B", 1);
		map.put("C", 1);
		System.out.println("Original Map: " + map);
		System.out.println("Inverted Map: " + invertMap(map));
	}
}
