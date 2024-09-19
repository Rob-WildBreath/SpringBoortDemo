package com.example.springboortdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {

    @RequestMapping("/login")
    public String login() {return "login";}

    @PostMapping("/login")
    public ModelAndView loginPost(@RequestParam("username")String username, @RequestParam("password")String password) {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("username", username);
        if(username.equals("admin") && password.equals("admin")) {
            mav.setViewName("index");
            mav.addObject("message", "You have successfully logged in!");
        }
        else {
            mav.setViewName("login");
            mav.addObject("message", "Wrong password!");
        }
        return mav;
    }
}
