package com.example.spring.controller;

import com.example.spring.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello")
    public String getHello(){
        return "get hello ";
    }
    @RequestMapping(path="hi")
    public String getHi(){
        return "request mapping hi";
    }

    @GetMapping("/pathvariable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName){
        System.out.println("my name is " + pathName);
        return pathName;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            sb.append(entry.getKey() + " " + entry.getValue());
        });
        return sb.toString();
    }

//    @GetMapping("/query-param2")
//    public String queryParam2(
//                @RequestParam
//                ){
//
//        }
//        return
//    }

    @GetMapping("/query-param3")
    public String queryParam3(UserRequest userRequest){

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
