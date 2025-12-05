package com.example.nasa.api;

import com.example.nasa.dtos.response.TleResponseDto;
import com.example.nasa.http.HttpService;
import java.util.Map;

public class TleClient extends BaseClient<TleResponseDto> {

    private static final String BASE_URL = "https://tle.ivanstanojevic.me/api/tle/";
    
    public TleClient(HttpService service) {
        super(service);
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }

    @Override
    protected Map<String, String> getQueryParams() {
        return Map.of("search", "{LANDSAT 9}");
    }

    @Override
    protected Class<TleResponseDto> getResponseType() {
        return TleResponseDto.class;
    }

}
