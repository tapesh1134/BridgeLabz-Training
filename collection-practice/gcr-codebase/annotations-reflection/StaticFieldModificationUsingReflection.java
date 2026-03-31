import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StaticFieldModificationUsingReflection {
	public static void main(String[] args) throws Exception {
		Class<?> confi = Configuration.class;
		Field field = confi.getDeclaredField("API_KEY");
		field.setAccessible(true);
		Method displayMethod = confi.getDeclaredMethod("display");
		displayMethod.setAccessible(true);
		System.out.print("Old ");
		displayMethod.invoke(null);
		field.set(null, "Fetch Code 453");
		System.out.print("New ");
		displayMethod.invoke(null);
	}
}

class Configuration {
	private static String API_KEY = "Fetch Code 123";

	private static void display() {
		System.out.println("API_KEY -> " + API_KEY);
	}
}