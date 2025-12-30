import java.util.ArrayList;
import java.util.List;

interface QueueOperations {
	void enqueue(int data);

	int dequeue();

	boolean isEmpty();
}

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

	public boolean isEmpty() {
		return element.isEmpty();
	}
}

class QueueUsingStack implements QueueOperations {
	private Stack stack = new Stack();
	private Stack tempStack = new Stack();

	public void enqueue(int data) {
		stack.push(data);
	}

	public int dequeue() {
		if (tempStack.isEmpty()) {
			while (!stack.isEmpty()) {
				tempStack.push(stack.pop());
			}
		}
		return tempStack.pop();
	}

	public boolean isEmpty() {
		return stack.isEmpty() && tempStack.isEmpty();
	}
}

public class QueueUsingStacks {
	public static void main(String[] args) {
		QueueUsingStack q1 = new QueueUsingStack();
		q1.enqueue(1);
		q1.enqueue(2);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		q1.enqueue(3);
		System.out.println(q1.dequeue());
	}
}