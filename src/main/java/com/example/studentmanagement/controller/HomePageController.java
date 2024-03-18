package com.example.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/homepage")
    public String showHomePage() {
        return "homepage";
    }
}
