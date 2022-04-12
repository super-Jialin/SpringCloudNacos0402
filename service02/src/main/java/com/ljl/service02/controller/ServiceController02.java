package com.ljl.service02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "s02")
public class ServiceController02 {
    @GetMapping("/hello")
    public String hello() {
        return "hello,我是2号";
    }


    @GetMapping("/hello/api/01")
    public void helloOne(@RequestParam(value = "test") String test) {
        System.out.println(test);
    }
}
