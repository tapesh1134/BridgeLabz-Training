
import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private NotificationService notifier = new NotificationService();

    private LibraryCatalog() {
    }

    public static synchronized LibraryCatalog getInstance() {
        return instance == null ? instance = new LibraryCatalog() : instance;
    }

    void addBook(Book book) {
        books.add(book);
        notifier.notifyObservers("New book added: " + book.title);
    }

    NotificationService notifier() {
        return notifier;
    }
}
