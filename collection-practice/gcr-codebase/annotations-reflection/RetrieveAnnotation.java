import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author{
	String name();
}

class Book{
	@Author(name = "tapesh")
	public void myBook() {
		System.out.println("My Book");
	}
}

public class RetrieveAnnotation {
	public static void main(String[] args) throws Exception {
		Book book = new Book();
		Class<?> cls = book.getClass();
		Method method = cls.getMethod("myBook");
		if(method.isAnnotationPresent(Author.class)) {
			Author author = method.getAnnotation(Author.class);
			System.out.println("Annotation value: " + author.name());
		}
		method.invoke(book);
	}
}
