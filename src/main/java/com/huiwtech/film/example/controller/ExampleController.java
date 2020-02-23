package com.huiwtech.film.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/example/")
public class ExampleController {

    @RequestMapping("test")
    public String test(String str) {

        System.out.println("str"+str);
        return "test"+str;
    }
}
