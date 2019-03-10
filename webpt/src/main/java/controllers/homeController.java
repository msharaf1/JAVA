package controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {


    @RequestMapping("/")
    public String showInfo(String hw){
        hw = "Hello World";
        return hw;
    }
}
