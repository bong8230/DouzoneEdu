package com.example.put.controller;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    /*@PutMapping("/put")
    public void put(@RequestBody PostRequestDto requestDto){
        System.out.println(requestDto);
    }*/

    @PutMapping("/put")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto){
        System.out.println(requestDto);
        return requestDto;
    }

    @PutMapping("/put-id/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name="userId")Long id){

        System.out.println(id);
        return requestDto;
    }

    /*
        {
            "name" : "bongje",
            "age" : 33,
            "car_list" :[
                {
                    "name" : "붕붕",
                    "car_number" : "11가 1234"
                 },
                 {
                    "name" : "붕붕카"
                    "car_number" : "22가 5678"
                 }
              ]
        }
    */
}
