package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/home")
    public String test(Model model){
        model.addAttribute("name","Saksham Saxena");
        model.addAttribute("id",1234);
        List<String> names=new ArrayList<>();
        names.add("saksham");
        names.add("saxena");
        model.addAttribute("friends",names);
        System.out.println("----------------------------Mapping is working fine");
        return "index";
    }
    @GetMapping("/about")
    public String test1(){
        System.out.println("---------------------------Mapping is working for about page");
        return "about";
    }
}
