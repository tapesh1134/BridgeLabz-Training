import java.util.HashMap;

public class QuestionBank {
	public void addQuestion(HashMap<String, String[]> questions, HashMap<String, String> answers, String question,
			String[] options, String answer) {
		questions.put(question, options);
		answers.put(question, answer);
	}
}
