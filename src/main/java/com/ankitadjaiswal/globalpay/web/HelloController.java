package com.ankitadjaiswal.globalpay.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {

     @GetMapping("/hello")
    public String hello() {
        return "Welcome to GlobalPay! Your Spring Boot application is running successfully.";
    }

}
