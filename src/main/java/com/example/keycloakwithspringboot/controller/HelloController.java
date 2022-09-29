package com.example.keycloakwithspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/visitor")
    public String getVisitor(@RequestHeader String Authorization) {
        return "Hello visitor";
    }

    @GetMapping("/admin")
    public String getAdmin(@RequestHeader String Authorization) {
        return "Hello admin";
    }

    @GetMapping("/user")
    public String getUsers(@RequestHeader String Authorization) {
        return "Hello user";
    }

    @GetMapping("/random")
    public String getRandomUser() {
        return "Hello random user";
    }
}
