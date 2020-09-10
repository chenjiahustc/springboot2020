package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gawain chen
 * @version 1.0
 * @email chenjia_hust@163.com
 * @date 2020/8/29 22:49
 */
@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String getHelloWorld(){
        return "Hello world.......";
    }
}

