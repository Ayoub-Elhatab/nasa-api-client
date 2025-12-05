package com.example.nasa.api;

import com.example.nasa.dtos.response.EpicResponseDto;
import com.example.nasa.http.HttpService;

public class EpicClient extends BaseClient<EpicResponseDto[]> {

    private static final String BASE_URL = "https://epic.gsfc.nasa.gov/api/natural";

    public EpicClient(HttpService service) {
        super(service, BASE_URL);
    }

    @Override
    protected Class<EpicResponseDto[]> getResponseType() {
        return EpicResponseDto[].class;
    }
}