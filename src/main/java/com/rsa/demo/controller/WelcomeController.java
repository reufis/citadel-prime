package com.rsa.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }

    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }
}
