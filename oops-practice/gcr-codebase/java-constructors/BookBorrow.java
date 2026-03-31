import java.util.Scanner;

public class BookBorrow {
	private String title;
	private String author;
	private double price;
	private boolean availability;

	public BookBorrow(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}

	public void borrowBook() {
		if (availability) {
			availability = false;
			System.out.println("Book borrowed successfully");
		} else {
			System.out.println("Book is not available");
		}
	}

	public void displayBookDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		System.out.println("Available: " + availability);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title of book: ");
		String title = scanner.next();
		System.out.print("Enter name of author: ");
		String author = scanner.next();
		System.out.print("Enter book price: ");
		double price = scanner.nextDouble();
		BookBorrow book = new BookBorrow("Clean Code", "Robert C. Martin", 450.0);

		book.displayBookDetails();
		book.borrowBook();
		book.borrowBook();
		scanner.close();
	}
}