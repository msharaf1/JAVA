package com.cbooks.science.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    
    @GetMapping(value="/home")
    public String showHome() {
        return "index.jsp";
    }
    
}