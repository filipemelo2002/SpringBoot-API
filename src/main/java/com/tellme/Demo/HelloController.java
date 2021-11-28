package com.tellme.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/json")
    public Map<String, String> jsonResponse() {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Greetings from Spring Boot, in JSON!");
        return map;
    }
}
