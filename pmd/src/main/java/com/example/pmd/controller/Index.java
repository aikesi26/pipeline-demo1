package com.example.pmd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping("/hello")
    public String hello() {
        System.err.println("you are in hello");

        return "hello jenkins";
    }
}
