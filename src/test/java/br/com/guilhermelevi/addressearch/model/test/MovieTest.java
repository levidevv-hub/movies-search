import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.guilhermelevi.addressearch.model.Movie;

class MovieTest {

    @Test
    void shouldCreateMovieCorrectly() {
        Movie movie = new Movie("Matrix");

        assertEquals("Matrix", movie.getName());
    }
}
