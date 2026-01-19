import java.util.HashMap;
import java.util.Stack;

public class Proctor {
	public void visitedQuestions(Stack<String> navigatorStack, String question) {
		navigatorStack.push(question);
	}

	public void submitAnswer(HashMap<String, String> submit, String quesiton, String answer) {
		submit.put(quesiton, answer);
		System.out.println("Answer Saved");
	}

	public String goBack(Stack<String> navigatorStack) {
		return navigatorStack.pop();
	}

	public int evaluateScores(HashMap<String, String> answers, HashMap<String, String> submit) {
		int sum = 0;
		for (String que : submit.keySet()) {
			if (answers.get(que) == submit.get(que)) {
				sum++;
			}
		}
		return sum;
	}
}
