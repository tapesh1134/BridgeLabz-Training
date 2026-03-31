import java.util.ArrayList;
import java.util.List;

public class RotateElement {
	public static List<Integer> rotate(List<Integer> list, int rotateBy) {
		rotateBy %= list.size();
		List<Integer> rotatedList = new ArrayList<>();
		for (int i = rotateBy; i < list.size(); i++) {
			rotatedList.add(list.get(i));
		}
		for (int i = 0; i < rotateBy; i++) {
			rotatedList.add(list.get(i));
		}
		return rotatedList;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int num : arr) {
			list.add(num);
		}
		int rotateBy = 2;
		System.out.println("Array before ratate: " + list);
		System.out.printf("Array after ratate by %d : %s", rotateBy, rotate(list, rotateBy));
	}

}
