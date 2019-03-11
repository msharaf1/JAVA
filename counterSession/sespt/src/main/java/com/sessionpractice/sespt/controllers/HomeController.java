package com.sessionpractice.sespt.controllers;

import java.util.*;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    //count page visits using session.
    @RequestMapping("/")
    public String countPageVisit(HttpSession sessoin){
        Integer count = 0;
        count = (Integer) sessoin.getAttribute("count");
        if(count == null || count < 1){
            count = 1;
        } else{
            
            count = count.intValue()+1;
        }
        
        sessoin.setAttribute("count", count);
        return count.toString();
    }



}