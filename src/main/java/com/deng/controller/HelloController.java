package com.deng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version v 1.0
 * @title [title]
 * @description [description]
 * @company WANDA CLOUD
 * @create 2019/4/20 0020 22:24
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){

        return "hello ,"+name+" !";

    }
}
