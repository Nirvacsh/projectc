package com.example.projectc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddingController {

    @GetMapping("/adding")
    public String adding(Model model){

        return "adding";
    }
}
