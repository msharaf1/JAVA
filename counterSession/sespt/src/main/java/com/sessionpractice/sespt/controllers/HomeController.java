package com.sessionpractice.sespt.controllers;

import java.util.*;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String countPageVisit(HttpSession sessoin){
        Integer count = 0;
        count = (Integer) sessoin.getAttribute("count");
        if(count == null || count < 1){
            // count = new Integer(1);
            count = 1;
        } else{
            // count = new Integer(count.intValue()+1);
            count = count.intValue()+1;
        }
        
        sessoin.setAttribute("count", count);
        return count.toString();
    }

    /*
    	Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			count = new Integer(1);
		}else {
			count = new Integer(count.intValue()+1);
		}
        session.setAttribute("count", count);
        */

}