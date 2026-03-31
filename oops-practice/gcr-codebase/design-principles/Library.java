import java.awt.List;
import java.security.PrivateKey;
import java.util.ArrayList;

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void displayBook() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}

public class Library {
	private String libraryName;
	private ArrayList<Book> books;
		
	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void displayLibraryBooks() {
		System.out.println("Library: " + libraryName);
		for (Book book : books) {
			book.displayBook();
		}
	}

	public static void main(String[] args) {
		Library lib1 = new Library("ABC");
		Book b1 = new Book("Java", "Raj");
		Book b2 = new Book("C++", "Rohan");
		lib1.addBook(b1);
		lib1.addBook(b2);
		lib1.displayLibraryBooks();
	}
}
