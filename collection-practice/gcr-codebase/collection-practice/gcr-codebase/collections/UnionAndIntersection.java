import java.util.HashSet;

public class UnionAndIntersection {

	public static void UnionIntersection(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> union = new HashSet<>();
		HashSet<Integer> intersection = new HashSet<>();
		for (int i : set1) {
			union.add(i);
			if (set2.contains(i)) {
				intersection.add(i);
			}
		}
		for (int i : set2) {
			union.add(i);
			if (set1.contains(i)) {
				intersection.add(i);
			}
		}
		System.out.println("Union of two sets: " + union);
		System.out.println("Intersection of two sets: " + intersection);
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
		UnionIntersection(set1, set2);
	}
}
