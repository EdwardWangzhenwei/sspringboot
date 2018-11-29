package com.yuhuashang.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ASUS
 * @Date: 2018/11/27 21:09
 * @Description:
 */
@RestController
public class HelloWroldController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello Spring Boot Wrold!";
    }
}
