package com.mnd.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // This maps the URL "http://localhost:8080/greet" to this method
    @GetMapping("/greet")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s! Welcome to your Spring Boot app.", name);
    }
}