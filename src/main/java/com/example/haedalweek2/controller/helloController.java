package com.example.haedalweek2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
