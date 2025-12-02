package com.example.nasa.api;

import com.example.nasa.dtos.apod.ApodResponse;
import com.example.nasa.http.HttpService;
import com.example.nasa.utils.JsonUtils;
import java.io.IOException;

public class ApodClient {

    final String BASE_URL = "https://api.nasa.gov/planetary/apod?api_key=o3Lcz9kB4M0jR44Ml1Gr1w2nXWABzJ2oBqJGqOTo";

    private final HttpService service;

    public ApodClient(HttpService service) {
        this.service = service;
    }

    public ApodResponse getData() throws IOException, InterruptedException {
        String data = service.getData(BASE_URL);
        return JsonUtils.toJson(data, ApodResponse.class);
    }
}
