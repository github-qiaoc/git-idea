package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class TestController {
    @RequestMapping("TestController2")
    public String test(){
        return "hello spring-boot";
    }
}
