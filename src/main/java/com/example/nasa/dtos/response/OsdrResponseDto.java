package com.example.nasa.dtos.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class OsdrResponseDto {

    private int hits;
    private String input;
    private int page_number;
    private int page_size;
    private int page_total;
    private Map<String, StudyData> studies;
    private boolean success;
    private int total_hits;
    private List<String> valid_input;

    @Getter
    @Setter
    @ToString
    public static class StudyData {
        private int file_count;
        private List<StudyFile> study_files;
    }

    @Getter
    @Setter
    @ToString
    public static class StudyFile {
        private String category;
        private double date_created;
        private String date_updated;
        private String file_name;
        private long file_size;
        private String organization;
        private String remote_url;
        private boolean restricted;
        private String subcategory;
        private String subdirectory;
        private boolean visible;
    }
}

