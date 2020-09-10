package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gawain chen
 * @version 1.0
 * @email chenjia_hust@163.com
 * @date 2020/8/30 10:15
 */
@RestController
public class ConfigController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/hello")
    public String sayHello(){
        return serverPort + ": hello......";
    }
}
