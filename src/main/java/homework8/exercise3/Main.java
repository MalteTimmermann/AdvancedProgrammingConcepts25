package homework8.exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 8.8, 2010);
        Movie movie2 = new Movie("The Matrix", 8.7, 1999);
        Movie movie3 = new Movie("Interstellar", 8.6, 2014);
        Movie movie4 = new Movie("The Godfather", 3, 1972);
        Movie movie5 = new Movie("Pulp Fiction", 2, 1994);
        Movie movie6 = new Movie("The Shawshank Redemption", 9.3, 1994);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);

        Stream<Movie> movieStream = movieList.stream();
        movieStream.filter(movie -> movie.getRating() >= 8.5)
                                 .sorted(Comparator.comparing(Movie::getYear).thenComparing(Movie::getRating).reversed())
                                 .forEach(System.out::println);
    }
}
