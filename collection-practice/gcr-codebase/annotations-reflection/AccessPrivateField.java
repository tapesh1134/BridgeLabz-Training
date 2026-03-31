import java.lang.reflect.Field;

class Person{
	private int age = 21;
}

public class AccessPrivateField {
	public static void main(String[] args) {
		try {
			Person person = new Person();
			Class<?> cls = person.getClass();
			Field ageField = cls.getDeclaredField("age");
			ageField.setAccessible(true);
			int originalAge = ageField.getInt(person);
			System.out.println("Original Age: " + originalAge);
			ageField.set(person, 30);
			int newAge = ageField.getInt(person);
			System.out.println("After Change: " + newAge);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
