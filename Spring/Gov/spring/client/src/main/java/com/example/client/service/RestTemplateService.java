package com.example.client.service;

import com.example.client.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {
    public UserResponse hello(){
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:8181")
                .path("/api/server/hello")
                .queryParam("name","bongje")
                .queryParam("age",33)
                .encode()
                .build()
                .toUri();

        System.out.println(uri.toString());
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri,UserResponse.class);

    }
}
