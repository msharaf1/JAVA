package com.spacex.spacex.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @RequestMapping("/")
    public String home(){
        return "Test";
    }


}
