package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldMain {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMain.class, args);
    }

    @GetMapping(value = "/hello")
    public String helloWorld(){
        return "Hello world......";
    }
}