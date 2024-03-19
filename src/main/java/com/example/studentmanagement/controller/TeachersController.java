package com.example.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TeachersController {

    @GetMapping("/teachers")
    public String showHomePage() {
        return "teachers";
    }
}
