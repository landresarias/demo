package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
    
    @GetMapping("/info")
    public String getInfo(){
        return "info";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
