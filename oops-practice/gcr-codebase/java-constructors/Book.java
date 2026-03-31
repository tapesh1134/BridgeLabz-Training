
public class Book {
	private String bookTitle;
	private String bookAuthor;
	private double price;

	public Book() {
		bookTitle = "Unknown";
		bookAuthor = "Unknown";
		price = 0.0;
	}

	public Book(String bookTitle, String bookAuthor, double price) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	public void bookDetails() {
		System.out.printf("Book title: %s%n", bookTitle);
		System.out.printf("Book author: %s%n", bookAuthor);
		System.out.printf("Price: %.2f%n", price);
	}
}
