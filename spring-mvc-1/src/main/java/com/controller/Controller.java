package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String test(){
        System.out.println("----------------------------Mapping is working fine");
        return "index";
    }
}
