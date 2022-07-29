package com.example.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MusicianDTO {
    private Long id;

    private String name;

    private Long strings;
    
    private String type;
    
    private String band;

    public MusicianDTO() {
        super();
    }

    // getters and setters
}
