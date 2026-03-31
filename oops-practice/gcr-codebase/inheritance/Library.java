class Book {
	String title;
	int publicationYear;

	public void displayInfo() {
		System.out.printf("Book Title: %s%n", title);
		System.out.printf("Publication Year: %d%n", publicationYear);
	}
}

class Author extends Book {
	String name;
	String bio;

	@Override
	public void displayInfo() {
		System.out.printf("Book Title: %s%n", title);
		System.out.printf("Publication Year: %d%n", publicationYear);
		System.out.printf("Author Name: %s%n", name);
		System.out.printf("Author Bio: %s%n", bio);
	}
}

public class Library {
	public static void main(String[] args) {
		Book book = new Author();
		book.title = "Java Fundamentals";
		book.publicationYear = 2023;
		Author author = (Author) book;
		author.name = "Raj";
		author.bio = "Software Developer and Java Trainer";
		book.displayInfo();
	}
}