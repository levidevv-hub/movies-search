package br.com.guilhermelevi.addressearch.model.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.guilhermelevi.addressearch.model.Serie;

class SerieTest {

    @Test
    void shouldCreateSerieCorrectly() {
        Serie serie = new Serie("Breaking Bad");

        assertEquals("Breaking Bad", serie.getName());
    }
}
