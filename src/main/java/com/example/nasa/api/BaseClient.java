package com.example.nasa.api;

import com.example.nasa.dtos.error.ApiErrorDto;
import com.example.nasa.dtos.response.ApiResponse;
import com.example.nasa.exception.ApiException;
import com.example.nasa.http.HttpService;
import com.example.nasa.utils.JsonUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public abstract class BaseClient <T>{

    protected final HttpService service;

    protected BaseClient(HttpService service) {
        this.service = service;
    }

    protected abstract String getBaseUrl();
    protected Map<String, String> getQueryParams() {
        return Collections.emptyMap();
    }
    protected abstract Class<T> getResponseType();

    public T getData() throws IOException, InterruptedException {
        String url = service.buildUrl(getBaseUrl(), getQueryParams());

        ApiResponse response = service.getData(url);

        if (response.getStatusCode() != 200) {
            ApiErrorDto error = JsonUtils.toJson(response.getBody(), ApiErrorDto.class);
            throw new ApiException(response.getStatusCode(), error.getMsg());
        }
        return JsonUtils.toJson(response.getBody(), getResponseType());
    }
}
