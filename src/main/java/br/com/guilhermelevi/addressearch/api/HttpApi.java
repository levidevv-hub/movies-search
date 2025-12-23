package br.com.guilhermelevi.addressearch.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpApi {

    private static final String API_KEY = "***REMOVED***";
    private static final String BASE_URL = "http://www.omdbapi.com/?t=";

    private final HttpClient client;

    public HttpApi() {
        this.client = HttpClient.newHttpClient();
    }

    public String searchMovie(String title) throws IOException, InterruptedException {

        String address = BASE_URL + title.replace(" ", "+")
                + "&apikey=" + API_KEY;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}

