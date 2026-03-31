import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Scanner;

import jdk.jshell.TypeDeclSnippet;

public class ClassInfo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter full class name: ");
		String string = scanner.nextLine();
		try {
			Class<?> cls = Class.forName(string);
			System.out.println("Class Name: " + cls.getName());
			
			Constructor<?> constructors[] = cls.getDeclaredConstructors();
			for(Constructor<?> constructor : constructors) {
				System.out.println(constructor);
			}
			Field fields[] = cls.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field);
			}
			Method[] methods = cls.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println(method);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
