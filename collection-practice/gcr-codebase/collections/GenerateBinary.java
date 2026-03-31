import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {

	public static void main(String[] args) {
		int n = 5;
		Queue<String> q = new LinkedList<>();
		for (int i = 1; i <= 5; i++) {
			q.add(Integer.toBinaryString(i));
		}
		System.out.printf("Binary number till %d: ", n);
		System.out.print(q);
	}

}
