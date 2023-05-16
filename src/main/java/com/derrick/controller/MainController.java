package com.derrick.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/homee")
    public String welcomePage(){
        return "hom";
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/dashboard")
    @PreAuthorize("isAuthenticated()")
    public String dashboard() {
        return "redirect:/employee_page";
    }

    @GetMapping("/admin")
    @PreAuthorize("isAuthenticated()")
    public String admin() {
        return "admin";
    }
}
