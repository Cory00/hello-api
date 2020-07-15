package com.cariton.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Value("${project.version}")
    private String versionProperty;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Controller - this is version: " + versionProperty;
    }
}
