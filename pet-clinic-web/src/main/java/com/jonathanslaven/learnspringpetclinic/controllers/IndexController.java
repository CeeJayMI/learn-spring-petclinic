package com.jonathanslaven.learnspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html", "index"})
    public String index() {
        return "index";
    }
}
