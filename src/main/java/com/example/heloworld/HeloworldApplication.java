package com.example.heloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HeloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeloworldApplication.class, args);
    }


}
