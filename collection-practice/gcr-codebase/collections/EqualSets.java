import java.util.HashSet;

public class EqualSets {
	public static boolean checkEqualSet(HashSet<Integer> set1, HashSet<Integer> set2) {
		if (set1.size() != set1.size()) {
			return false;
		}
		for (int i : set1) {
			if (!set2.contains(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(2);
		set2.add(1);
		System.out.println("Elements of set1: " + set1);
		System.out.println("Elements of set2: " + set2);
		System.out.printf("Two sets are %sequal", checkEqualSet(set1, set2) ? "" : "not ");
	}

}
