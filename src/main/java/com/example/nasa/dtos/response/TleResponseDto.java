package com.example.nasa.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@ToString
public class TleResponseDto {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("totalItems")
    private Integer totalItems;

    @JsonProperty("member")
    private List<Tle> member;

    @JsonProperty("parameters")
    private Parameters parameters;

    @JsonProperty("view")
    private View view;

    @Getter
    @Setter
    @ToString
    public static class Tle {
        @JsonProperty("@id")
        private String id;

        @JsonProperty("@type")
        private String type;

        @JsonProperty("satelliteId")
        private Integer satelliteId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("date")
        private String date;

        @JsonProperty("line1")
        private String line1;

        @JsonProperty("line2")
        private String line2;
    }

    @Getter
    @Setter
    @ToString
    public static class Parameters {
        @JsonProperty("search")
        private String search;

        @JsonProperty("sort")
        private String sort;

        @JsonProperty("sort-dir")
        private String sortDir;

        @JsonProperty("page")
        private Integer page;

        @JsonProperty("page-size")
        private Integer pageSize;
    }

    @Getter
    @Setter
    @ToString
    public static class View {
        @JsonProperty("@id")
        private String id;

        @JsonProperty("@type")
        private String type;

        @JsonProperty("first")
        private String first;

        @JsonProperty("last")
        private String last;

        @JsonProperty("next")
        private String next;

        @JsonProperty("previous")
        private String previous;
    }
}
