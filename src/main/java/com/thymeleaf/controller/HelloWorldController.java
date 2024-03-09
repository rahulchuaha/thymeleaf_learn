package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(Model model){

        model.addAttribute("message", "hello-world");
        return "hello-world";
    }
    
}
