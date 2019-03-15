package com.webpt.pt.com.webpt.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class homeController {

    @RequestMapping("/")
    public String index(){
//        model.addAttribute("name", "James");

        return "index.jsp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password, Model model, HttpSession session){
//        model.addAttribute("username",username);
//        model.addAttribute("password", password);
        return "redirect:/dashboard?username=" + username + "&password=" + password;

//        return "redirect:/dashboard";
//        return "index.jsp";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboard(@RequestParam(value="username", required=false) String username, @RequestParam(value="password", required=false) String password, Model model){
        model.addAttribute("username",username);
        model.addAttribute("password", password);
        return "dashboard.jsp";
    }
}
