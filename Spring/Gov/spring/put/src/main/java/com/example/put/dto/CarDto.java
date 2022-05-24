package com.example.put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CarDto {
    private String name;//차이름
    @JsonProperty("car_number")
    private String carNumber;//차번호
}
