package com.jonathanslaven.learnspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/", "/index", "/vs/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
