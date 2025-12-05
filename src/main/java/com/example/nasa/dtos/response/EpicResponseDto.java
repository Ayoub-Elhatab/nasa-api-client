package com.example.nasa.dtos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class EpicResponseDto {
    private String identifier;
    private String caption;
    private String image;
    private String version;
    private String date;

    @Getter
    @Setter
    @ToString
    public static class CentroidCoordinates {
        private double lat;
        private double lon;
    }

    private CentroidCoordinates centroid_coordinates;

    @Getter
    @Setter
    @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Position {
        private double x;
        private double y;
        private double z;
    }

    private Position dscovr_j2000_position;
    private Position lunar_j2000_position;
    private Position sun_j2000_position;

    @Getter
    @Setter
    @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AttitudeQuaternions {
        private double q0;
        private double q1;
        private double q2;
        private double q3;
    }

    private AttitudeQuaternions attitude_quaternions;
}