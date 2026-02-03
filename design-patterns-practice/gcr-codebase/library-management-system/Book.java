
import java.util.List;

public class Book {

    String title;
    List<String> authors;
    String edition, genre, publisher;

    private Book(Builder b) {
        title = b.title;
        authors = b.authors;
        edition = b.edition;
        genre = b.genre;
        publisher = b.publisher;
    }

    static class Builder {

        private String title;
        private List<String> authors;
        private String edition, genre, publisher;

        Builder(String title) {
            this.title = title;
        }

        Builder authors(List<String> a) {
            authors = a;
            return this;
        }

        Builder edition(String e) {
            edition = e;
            return this;
        }

        Builder genre(String g) {
            genre = g;
            return this;
        }

        Builder publisher(String p) {
            publisher = p;
            return this;
        }

        Book build() {
            return new Book(this);
        }
    }
}
