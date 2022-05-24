package com.example.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Sample {
    private String id;
    private String name;

}

class SampleTest{

}
