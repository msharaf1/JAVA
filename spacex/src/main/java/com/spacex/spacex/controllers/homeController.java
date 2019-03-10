package com.spacex.spacex.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class homeController {

    @RequestMapping("/")
    public Integer home(HttpSession session){
        Integer count = (Integer) session.getAttribute("count");
        if(count == null || count <=0){
            count = new Integer(1);
        } else{
            count = new Integer(count.intValue()+1);
        }
        session.setAttribute("count", count);

        return count;

    }


}
