package com.example.sap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {

    @GetMapping(value = "/")
    public ModelAndView welcomePage(ModelAndView model) {
        model.setViewName("hello");
        return model;
    }
}
