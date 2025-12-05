package com.example.nasa;

import com.example.nasa.api.*;
import com.example.nasa.utils.JsonUtils;
import java.util.Map;

public class Main {

    private static final String API_KEY = "o3Lcz9kB4M0jR44Ml1Gr1w2nXWABzJ2oBqJGqOTo";

    public static void main(String[] args) throws Exception {

        // this for testing

        NasaApiClient nasa = new NasaApiClient();

//        JsonUtils.print(nasa.apod().getData(Map.of("api_key", "DEMO_KEY")));
//        JsonUtils.print(nasa.neo().getData(Map.of("start_date", "2025-01-01", "end_date", "2025-01-08", "api_key", "DEMO_KEY")));
//        JsonUtils.print(nasa.insight().getData(Map.of("api_key","DEMO_KEY", "feedtype", "json", "ver", "1.0")));
//        JsonUtils.print(nasa.osdr().getData(87, Map.of()));
//        JsonUtils.print(nasa.tle().getData(Map.of("search", "{LANDSAT 9}")));
//        JsonUtils.print(nasa.epic().getData(Map.of()));

    }
}