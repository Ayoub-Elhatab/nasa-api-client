package com.example.nasa.api;

import com.example.nasa.dtos.response.OsdrResponseDto;
import com.example.nasa.http.HttpService;

public class OsdrClient extends BaseClient<OsdrResponseDto> {

    private static final String BASE_URL = "https://osdr.nasa.gov/osdr/data/osd/files/";
    private int studyAccessionNumber;

    public OsdrClient(HttpService service) {
        super(service);
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL + studyAccessionNumber;
    }

    @Override
    protected Class<OsdrResponseDto> getResponseType() {
        return OsdrResponseDto.class;
    }

    public OsdrResponseDto getData(int studyAccessionNumber) throws Exception {
        this.studyAccessionNumber = studyAccessionNumber;
        return super.getData();
    }
}


