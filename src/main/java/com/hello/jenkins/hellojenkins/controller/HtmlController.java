package com.hello.jenkins.hellojenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/")
    public String toIndex(){
        System.out.println(1111111111);
        return "index";
    }
}
