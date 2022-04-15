package com.example.heloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("ddddsfsf");
        return ("<h1>Welcome User</h1>");
    }

}
