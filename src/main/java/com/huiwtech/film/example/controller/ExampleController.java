package com.huiwtech.film.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/example/")
public class ExampleController {

    @RequestMapping(value = "test")
    public String test(String test){

        System.out.println("str="+test);

        return "test="+test;
    }

}
