package org.perscholas.controllers;

import lombok.extern.java.Log;
import org.perscholas.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
@Log
@Controller
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home(Model model){
        Date date = new Date();
        log.info("The date is: " + date);
        model.addAttribute("serverTime", date);
        return "home";
    }
    @RequestMapping(value="/user", method = RequestMethod.POST)
    public String user(@Validated User user, Model model){
        System.out.println("User " + user.getUserName());
        model.addAttribute("userName", user.getUserName());
        return "userpage";
    }


}


