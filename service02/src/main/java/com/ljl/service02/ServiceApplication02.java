package com.ljl.service02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication02.class);
    }
}
