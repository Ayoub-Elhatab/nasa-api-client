package com.example.nasa.api;

import com.example.nasa.dtos.neows.NeoWsDto;
import com.example.nasa.http.HttpService;
import com.example.nasa.utils.JsonUtils;
import lombok.RequiredArgsConstructor;
import java.io.IOException;
import java.util.Map;

@RequiredArgsConstructor
public class NeoWsClient {

    final String BASE_URL = "https://api.nasa.gov/neo/rest/v1/feed";

    private final HttpService service;

    private final Map<String,String> params = Map.of(
            "start_date", "2025-01-01",
            "end_date", "2025-01-08",
            "api_key", "o3Lcz9kB4M0jR44Ml1Gr1w2nXWABzJ2oBqJGqOTo"
    );

    public NeoWsDto getData() throws IOException, InterruptedException {
        String url = service.buildUrl(BASE_URL, params);
        String data = service.getData(url);
        return JsonUtils.toJson(data, NeoWsDto.class);
    }
}
