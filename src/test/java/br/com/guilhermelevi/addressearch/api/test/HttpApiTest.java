package br.com.guilhermelevi.addressearch.api.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.guilhermelevi.addressearch.api.HttpApi;

@ExtendWith(MockitoExtension.class)
class HttpApiTest {

    @Mock
    HttpClient client;

    @Mock
    HttpResponse<String> response;

    @Test
    void shouldReturnMovieJsonWhenSearchingMovie() throws Exception {

        String jsonMock = "{ \"Title\": \"Matrix\", \"Year\": \"1999\" }";

        when(response.body()).thenReturn(jsonMock);
        when(client.send(any(), any())).thenReturn(response);

        HttpApi api = new HttpApi(client);

        String result = api.searchMovie("Matrix");

        assertTrue(result.contains("Matrix"));
    }
}
