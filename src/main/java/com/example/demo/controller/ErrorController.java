package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/error")
public class ErrorController {
    @GetMapping("/")
    public ModelAndView display404(){
        ModelAndView modelAndView = new ModelAndView("error404");
        return modelAndView;
    }
}
