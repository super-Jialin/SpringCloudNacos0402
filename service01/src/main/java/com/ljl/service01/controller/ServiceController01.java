package com.ljl.service01.controller;

import com.ljl.service01.api.ServiceClient01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "s01")
public class ServiceController01 {
    @Autowired
    private ServiceClient01 serviceClient01;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/api02")
    public void helloApi(){
        serviceClient01.test("调用api");
    }

}
