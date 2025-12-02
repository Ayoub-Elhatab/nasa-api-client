package com.example.nasa;

import com.example.nasa.api.ApodClient;
import com.example.nasa.api.NeoWsClient;
import com.example.nasa.dtos.apod.ApodResponse;
import com.example.nasa.dtos.neows.NeoWsDto;
import com.example.nasa.http.HttpService;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpService service = new HttpService();
        ApodClient client1 = new ApodClient(service);
        NeoWsClient client2 = new NeoWsClient(service);

        ApodResponse apod = client1.getData();
        NeoWsDto neoWs = client2.getData();

        System.out.println(apod);
        System.out.println(neoWs);

    }
}