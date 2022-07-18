package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Administrator;
import com.example.demo.serviços.AdministratorRepository;


@Controller
public class AdminController {
    
    @Autowired
    private AdministratorRepository repo;
    

    @GetMapping("/admin")
    public String index(Model model){
    

        List<Administrator> administrator = (List<Administrator>)repo.findAll();
        model.addAttribute("administrator", administrator);

        return "admin/index";
    }
}
