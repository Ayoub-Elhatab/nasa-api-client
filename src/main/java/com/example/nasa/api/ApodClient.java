package com.example.nasa.api;

import com.example.nasa.dtos.apod.ApodResponse;
import com.example.nasa.http.HttpService;
import com.example.nasa.utils.JsonUtils;
import lombok.RequiredArgsConstructor;
import java.io.IOException;
import java.util.Map;

@RequiredArgsConstructor
public class ApodClient {

    private final HttpService service;

    private static final String BASE_URL = "https://api.nasa.gov/planetary/apod";

    private final Map<String,String> params = Map.of(
            "api_key", "o3Lcz9kB4M0jR44Ml1Gr1w2nXWABzJ2oBqJGqOTo"
    );

    public ApodResponse getData() throws IOException, InterruptedException {
        String url = service.buildUrl(BASE_URL, params);
        String data = service.getData(url);
        return JsonUtils.toJson(data, ApodResponse.class);
    }
}
