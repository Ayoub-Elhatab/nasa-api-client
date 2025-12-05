package com.example.nasa;

import com.example.nasa.api.ApodClient;
import com.example.nasa.api.InSightClient;
import com.example.nasa.api.NeoWsClient;
import com.example.nasa.api.OsdrClient;
import com.example.nasa.http.HttpService;
import com.example.nasa.utils.JsonUtils;

public class Main {

    public static void main(String[] args) throws Exception {

        HttpService service = new HttpService();

        ApodClient apodClient = new ApodClient(service);
        NeoWsClient neoClient = new NeoWsClient(service);
        InSightClient insightClient = new InSightClient(service);
        OsdrClient osdrClient = new OsdrClient(service);

        JsonUtils.print(apodClient);
        JsonUtils.print(neoClient);
        JsonUtils.print(insightClient);
        JsonUtils.print(osdrClient.getData(87));

    }
}