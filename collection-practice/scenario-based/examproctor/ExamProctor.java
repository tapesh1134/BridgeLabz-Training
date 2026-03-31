import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ExamProctor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuestionBank questionBank = new QuestionBank();
		HashMap<String, String[]> questions = new HashMap<>();
		HashMap<String, String> answers = new HashMap<>();

		questionBank.addQuestion(questions, answers, "What is the capital of India?",
				new String[] { "Mumbai", "New Delhi", "Kolkata", "Chennai" }, "New Delhi");

		questionBank.addQuestion(questions, answers, "Which data structure follows LIFO?",
				new String[] { "Queue", "Array", "Stack", "LinkedList" }, "Queue");

		questionBank.addQuestion(questions, answers, "Which keyword is used to inherit a class in Java?",
				new String[] { "implement", "extends", "inherit", "super" }, "extends");

		questionBank.addQuestion(questions, answers, "Which collection does not allow duplicate elements?",
				new String[] { "List", "Map", "Set", "ArrayList" }, "Set");

		questionBank.addQuestion(questions, answers, "What is the size of int in Java?",
				new String[] { "2 bytes", "4 bytes", "8 bytes", "Depends on OS" }, "2 bytes");

		questionBank.addQuestion(questions, answers, "Which company developed Java?",
				new String[] { "Microsoft", "Apple", "Sun Microsystems", "Google" }, "Sun Microsystems");

		HashMap<String, String> submit = new HashMap<>();
		Proctor proctor = new Proctor();
		Stack<String> navigatorStack = new Stack<>();
		for (String que : questions.keySet()) {
			System.out.println(que);
			int idx = 1;
			for (String opt : questions.get(que)) {
				System.out.print(idx + ". " + opt + "  ");
				idx++;
			}
			System.out.print("\nEnter your option: ");
			int option = scanner.nextInt();
			proctor.submitAnswer(submit, que, questions.get(que)[option - 1]);
			proctor.visitedQuestions(navigatorStack, que);
			System.out.print("Press 1 for go back: ");
			int isGoBack = scanner.nextInt();
			if (isGoBack == 1) {
				String prevQuestion = proctor.goBack(navigatorStack);
				System.out.println(prevQuestion);
				idx = 1;
				for (String opt : questions.get(que)) {
					System.out.print(idx + ". " + opt + "  ");
					idx++;
				}
				System.out.print("\nEnter your answer: ");
				int updatedOption = scanner.nextInt();
				proctor.submitAnswer(submit, que, questions.get(que)[updatedOption - 1]);
				proctor.visitedQuestions(navigatorStack, que);
			}

		}
		System.out.println("Score is: " + proctor.evaluateScores(answers, submit) + "/" + questions.size());
		scanner.close();
	}
}