package com.jamesmansour.songr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Controller
public class MainController {
    //=======================Routs===================
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello-world.html";
    }

    @GetMapping("/capitalize/{toCapitalize}")
    public String capitalize(Model m, @PathVariable String toCapitalize) {
        m.addAttribute("string", toCapitalize.toUpperCase());
        return "capitalize.html";
    }

    @GetMapping("/")
    public String Landing() {
        return "landing.html";
    }


}
