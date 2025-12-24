package com.example.nasa.http;

import com.example.nasa.dtos.response.ApiResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpService {

    private final HttpClient client;

    public HttpService() {
        client = HttpClient.newHttpClient();
    }

    private String encode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("URL encoding failed", e);
        }
    }

    public String buildUrl(String base, Map<String, String> params) {
        return base + "?" + params.entrySet()
                .stream()
                .map(e -> encode(e.getKey()) + "=" + encode(e.getValue()))
                .collect(Collectors.joining("&"));
    }

    public ApiResponse getData(String uri) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .version(HttpClient.Version.HTTP_2)
                .GET()
                .timeout(Duration.ofSeconds(5))
                .build();

        java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());

        return new ApiResponse(response.statusCode(), response.body());
    }
}
