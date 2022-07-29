package com.example.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BandDTO {
    private long id;

    private String name;

    private long phone;
    
    private String musicians;

//    public BandDTO() {
//        super();
//    }

    // getters and setters
}
