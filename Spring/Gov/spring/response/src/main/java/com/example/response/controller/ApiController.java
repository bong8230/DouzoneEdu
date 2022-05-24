package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    //Text
    @GetMapping("/text") //GET, http://localhost:8181/api/text?account=user100
    public String text(@RequestParam String account){
        return account;
    }
    //Json
    @PostMapping("/json") //POST, http://localhost:8181/api/json
    //req -> object mapper -> object -> method -> object mapper -> json -> response
    public User json(@RequestBody User user){
        return user;
    }

    //ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user); //Created:201
    }
}

    /*
    {
        "name" : "bong",
            "age": 10,
            "phoneNumber" : "010-1234-5678",
            "address" : "seongnam"
    }
    */
