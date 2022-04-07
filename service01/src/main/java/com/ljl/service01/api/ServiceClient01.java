package com.ljl.service01.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "serviceApi01")
public interface ServiceClient01 {
    @GetMapping(value = "/api/hello/one")
    void test(@RequestParam(value = "test")String test);
}
