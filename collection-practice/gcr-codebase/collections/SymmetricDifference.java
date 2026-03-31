import java.util.HashSet;

public class SymmetricDifference {

	public static HashSet<Integer> differnce(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> diff = new HashSet<>();
		for (int i : set1) {
			if (!set2.contains(i)) {
				diff.add(i);
			}
		}
		for (int i : set2) {
			if (!set1.contains(i)) {
				diff.add(i);
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Elements of set1: " + set1);
		System.out.println("Elements of set2: " + set2);
		System.out.println("Symmetric Differnce of two sets: " + differnce(set1, set2));
	}

}
