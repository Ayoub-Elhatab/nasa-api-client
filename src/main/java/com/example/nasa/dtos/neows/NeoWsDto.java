package com.example.nasa.dtos.neows;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class NeoWsDto {
    private Links links;
    private int element_count;
    private Map<String, List<NearEarthObject>> near_earth_objects;

    @Getter
    @Setter
    @ToString
    public static class Links {
        private String next;
        private String previous;
        private String self;
    }

    @Getter
    @Setter
    @ToString
    public static class NearEarthObject {
        private Links links;
        private String id;
        private String neo_reference_id;
        private String name;
        private String nasa_jpl_url;
        private double absolute_magnitude_h;
        private EstimatedDiameter estimated_diameter;

        @JsonProperty("is_potentially_hazardous_asteroid")
        private boolean is_potentially_hazardous_asteroid;

        private List<CloseApproachData> close_approach_data;

        @JsonProperty("is_sentry_object")
        private boolean is_sentry_object;
        private String sentry_data;
    }

    @Getter
    @Setter
    @ToString
    public static class EstimatedDiameter {
        private DiameterUnit kilometers;
        private DiameterUnit meters;
        private DiameterUnit miles;
        private DiameterUnit feet;
    }

    @Getter
    @Setter
    @ToString
    public static class DiameterUnit {
        private double estimated_diameter_min;
        private double estimated_diameter_max;
    }

    @Getter
    @Setter
    @ToString
    public static class CloseApproachData {
        private String close_approach_date;
        private String close_approach_date_full;
        private long epoch_date_close_approach;
        private RelativeVelocity relative_velocity;
        private MissDistance miss_distance;
        private String orbiting_body;
    }

    @Getter
    @Setter
    @ToString
    public static class RelativeVelocity {
        private String kilometers_per_second;
        private String kilometers_per_hour;
        private String miles_per_hour;
    }

    @Getter
    @Setter
    @ToString
    public static class MissDistance {
        private String astronomical;
        private String lunar;
        private String kilometers;
        private String miles;
    }
}
