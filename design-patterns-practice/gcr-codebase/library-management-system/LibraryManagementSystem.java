
import java.util.Arrays;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        catalog.notifier().subscribe(new LibraryUser("Tapesh"));
        catalog.notifier().subscribe(new LibraryUser("Amit"));

        Book book = new Book.Builder("Data Structures by Cormen")
                .authors(Arrays.asList("Cormen", "Leiserson"))
                .edition("3rd")
                .genre("CS")
                .build();

        catalog.addBook(book);

        User user = UserFactory.create("student");
        user.role();
    }
}
