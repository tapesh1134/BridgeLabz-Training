import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
	static void reverseQueue(Queue<Integer> q) {
		int size = q.size();
		int[] arr = new int[q.size()];
		for (int i = 0; i < size; i++) {
			arr[i] = q.remove();
		}
		for (int i = size - 1; i >= 0; i--) {
			q.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println("Original Queue: " + q);
		reverseQueue(q);
		System.out.println("Reversed Queue: " + q);
	}
}
