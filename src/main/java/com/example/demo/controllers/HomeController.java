package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
    
    @GetMapping({"/" , "/home"})
    public String index(Model model){

        model.addAttribute("someText", "teste");
        return "home/index";
    }

    @GetMapping("/home/index")
    public String doStuffMethod(Model model) {
        model.addAttribute("someText", "resultou");
        return "home/index";
    }
}
