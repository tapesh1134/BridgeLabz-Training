import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			MathOperations mathOperations = new MathOperations();
			Class<?> cls = mathOperations.getClass();
			System.out.print("Enter first number: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter second number: ");
			int num2 = scanner.nextInt();
			System.out.print("Enter maths operations (add,subtract,multiply): ");
			String operation = scanner.next();
			Method method = cls.getMethod(operation, int.class, int.class);
			Object result = method.invoke(mathOperations, num1,num2);
			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
