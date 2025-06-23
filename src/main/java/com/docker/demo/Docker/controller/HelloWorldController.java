package com.docker.demo.Docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("message")
    public String getHello(){
        return("Hello This From Docker Setup");
        return("From Jenkins");
    }
}
