package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjianjian on 17/8/27.
 */
@RestController
public class HelloworldController {
    @RequestMapping("/hello")
    public String index(){
        return "helloworld";
    }

}
