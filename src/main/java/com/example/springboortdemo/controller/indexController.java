package com.example.springboortdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class indexController {

    //?name=
    @RequestMapping("/index")
    public ModelAndView index(@RequestParam String name ) {

        if(name==null || name.isEmpty()){
            return new ModelAndView("index");
        }
        else{
            ModelAndView modelAndView = new ModelAndView("index");

            Map<String, Object> model = modelAndView.getModel();

            model.put("name", name);

            return modelAndView;
        }

    }
}
