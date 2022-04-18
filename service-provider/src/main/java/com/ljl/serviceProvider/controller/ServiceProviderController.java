package com.ljl.serviceProvider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {
    @RequestMapping(value = "{string}", method = RequestMethod.GET)
    public String getInfo(@PathVariable String string){
        return "Info: " + string;
    }
}
