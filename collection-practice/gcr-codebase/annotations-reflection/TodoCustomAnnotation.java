import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
	String task();

	String assignedTo();

	String priority() default "MEDIUM";

}

class PendingTasks {
	@Todo(task = "Read file", assignedTo = "Madhav")
	public void read() {
	}

	@Todo(task = "Write file", assignedTo = "Aditya", priority = "HIGH")
	public void write() {
	}
}

public class TodoCustomAnnotation {

	public static void main(String[] args) {
		Method methods[] = PendingTasks.class.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Todo.class)) {
				Todo toDo = method.getAnnotation(Todo.class);
				System.out.println("Method -> " + method.getName());
				System.out.println("Task -> " + toDo.task());
				System.out.println("Assigned To -> " + toDo.assignedTo());
				System.out.println("Priority -> " + toDo.priority());
				System.out.println();
			}
		}

	}

}
