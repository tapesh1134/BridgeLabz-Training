import java.util.Scanner;

class HandBook {
	String bookTitle;
	String bookAuthor;
	double price;

	HandBook(String bookTitle, String bookAuthor, double price) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	public void displayBookDetails() {
		System.out.printf("Title of the book: %s%n", bookTitle);
		System.out.printf("Author of the book: %s%n", bookAuthor);
		System.out.printf("Price of the book: %.2f", price);
	}
}

public class BookDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter book title: ");
		String bookTitle = scanner.next();
		System.out.print("Enter book author: ");
		String bookAuthor = scanner.next();
		System.out.print("Enter book price: ");
		double price = scanner.nextDouble();
		HandBook book1 = new HandBook(bookTitle, bookTitle, price);
		book1.displayBookDetails();
	}
}
