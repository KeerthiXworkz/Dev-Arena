package com.devArena.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {


    @GetMapping("hello")
    public String getHelloWorld(){

        return "Hello,World!";
    }
}
