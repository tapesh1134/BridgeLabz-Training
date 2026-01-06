import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
	public static void reverseList(List<Integer> ls) {
		int[] arr = new int[ls.size()];
		for (int i = 0; i < ls.size(); i++) {
			arr[i] = ls.get(i);
		}
		ls.clear();
		for (int i = arr.length - 1; i >= 0; i--) {
			ls.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		System.out.println("ArrayList without reverse: " + list1);
		reverseList(list1);
		System.out.println("ArrayList after reverse: " + list1);
		System.out.println("LinkedList without reverse: " + list2);
		reverseList(list2);
		System.out.println("LinkedList after reverse: " + list2);
	}
}
