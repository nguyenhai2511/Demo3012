package com.example.demo3012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "-118.270293") double kinhdo, @RequestParam(required = false, defaultValue = "34.039737") double vido, Model  model){
        model.addAttribute("kinhdo",kinhdo);
        model.addAttribute("vido",vido);
        return "index";
    }
}
