package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
    String : value
    number : value
    boolean : value
    object : value { }
    array : value []


    {
        "phone_number" : "010-1234-5678",
        "age" : 10,
        "isAgree" : false,
        "account" : {
                "email" : "bong@a.a",
                "password" : "1234"
         }
    }

    //user 조회
    {
        "user_list" : [
            {
                "account" : "bong",
                "password" : "1234",
            },
            {
                "account" : "seong",
                "password" : "11111",
            },
            {
                "account" : "je",
                "password" : "2222",
            },
         ]
    }
*/

@RestController
@RequestMapping("/api")
public class PostApiController {
    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){

//        requestData.entrySet().forEach(strObjectEntry ->{
//            System.out.println("key : " + strObjectEntry.getKey());
//            System.out.println("value : " + strObjectEntry.getValue());
//        });
        requestData.forEach((key,value)->{
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }

    @PostMapping("/post-object")
    public void postObject(@RequestBody PostRequestDto postRequestDto){
        System.out.println(postRequestDto);
    }
}
