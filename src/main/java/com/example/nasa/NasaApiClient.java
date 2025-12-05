package com.example.nasa;

import com.example.nasa.api.*;
import com.example.nasa.http.HttpService;

public class NasaApiClient {

    private final ApodClient apodClient;
    private final NeoWsClient neoClient;
    private final InSightClient insightClient;
    private final OsdrClient osdrClient;
    private final TleClient tleClient;
    private final EpicClient epicClient;

    public NasaApiClient() {
        HttpService service = new HttpService();
        this.apodClient = new ApodClient(service);
        this.neoClient = new NeoWsClient(service);
        this.insightClient = new InSightClient(service);
        this.osdrClient = new OsdrClient(service);
        this.tleClient = new TleClient(service);
        this.epicClient = new EpicClient(service);
    }

    public ApodClient apod() { return apodClient; }
    public NeoWsClient neo() { return neoClient; }
    public InSightClient insight() { return insightClient; }
    public OsdrClient osdr() { return osdrClient; }
    public TleClient tle() { return tleClient; }
    public EpicClient epic() { return epicClient; }
}