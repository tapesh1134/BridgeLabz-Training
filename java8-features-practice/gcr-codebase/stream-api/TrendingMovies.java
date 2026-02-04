
import java.util.ArrayList;
import java.util.List;

class Movies {

    String name;
    double rating;
    int releaseYear;

    public Movies(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return name + " | " + rating + " |  " + " | " + releaseYear;
    }
}

public class TrendingMovies {

    public static void main(String[] args) {
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("KGF", 8.2, 2022));
        movies.add(new Movies("Stranger Things", 8.0, 2018));
        movies.add(new Movies("The Rip", 7.0, 2025));
        movies.add(new Movies("Inception", 8.8, 2010));
        movies.add(new Movies("Interstellar", 8.6, 2014));
        movies.add(new Movies("The Dark Knight", 9.0, 2008));
        movies.add(new Movies("Coco", 8.4, 2017));
        movies.add(new Movies("The Shawshank Redemption", 9.3, 1994));
        movies.add(new Movies("Dune: Part Two", 8.4, 2025));

        movies.stream()
                .filter(n -> n.releaseYear > 2000)
                .sorted((n1, n2) -> (int) n2.rating - (int) n1.rating)
                .limit(5)
                .forEach(System.out::println);
    }
}
