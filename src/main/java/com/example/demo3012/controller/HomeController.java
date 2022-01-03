package com.example.demo3012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(required = false) double kinhdo, @RequestParam(required = false) double vido, Model  model){
        model.addAttribute("kinhdo",kinhdo);
        model.addAttribute("vido",vido);
        return "index";
    }
}
