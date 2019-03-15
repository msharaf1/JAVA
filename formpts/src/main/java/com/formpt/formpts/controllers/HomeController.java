package com.formpt.formpts.controllers;



import com.formpt.formpts.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class HomeController {

    @RequestMapping(value ="/employee", method = RequestMethod.GET)
    public ModelAndView showForm(){

        return new ModelAndView("employeeHome", "employee", new Employee());
    }
    @RequestMapping(value="/addEmployee", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("employee") Employee employee,
                         BindingResult result, ModelMap model){
        if(result.hasErrors()){
            return "error";
        }
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "employeeView";
    }
}//class
