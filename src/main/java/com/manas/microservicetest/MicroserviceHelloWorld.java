package com.manas.microservicetest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MicroserviceHelloWorld
{
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World!";
    }
}
