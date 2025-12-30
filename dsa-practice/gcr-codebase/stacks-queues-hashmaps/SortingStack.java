import java.util.ArrayList;
import java.util.List;

class Stack {
	private List<Integer> element = new ArrayList<>();

	public void push(int data) {
		element.add(data);
	}

	public int pop() {
		if (element.isEmpty()) {
			return -1;
		}
		return element.remove(element.size() - 1);
	}

	public int peek() {
		if (element.isEmpty()) {
			return -1;
		}
		return element.get(element.size() - 1);
	}

	public boolean isEmpty() {
		return element.isEmpty();
	}

	public void display() {
		System.out.println(element);
	}
}

class SortStack {
	public void sort(Stack stack) {
		if (stack.isEmpty()) {
			return;
		}

		int temp = stack.pop();
		sort(stack);
		insertInSortedOrder(stack, temp);
	}

	private void insertInSortedOrder(Stack stack, int value) {
		if (stack.isEmpty() || stack.peek() <= value) {
			stack.push(value);
			return;
		}

		int temp = stack.pop();
		insertInSortedOrder(stack, value);
		stack.push(temp);
	}
}

public class SortingStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(1);
		stack.push(3);
		stack.push(2);
		System.out.print("Unsorted: ");
		stack.display();
		SortStack st = new SortStack();
		st.sort(stack);
		System.out.print("Sorted: ");
		stack.display();
	}
}