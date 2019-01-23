package com.org.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class SampleController {
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

}
