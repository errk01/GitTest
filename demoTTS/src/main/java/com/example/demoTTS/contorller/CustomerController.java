package com.example.demoTTS.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {
    @GetMapping("/dataPage")
    public String loginForm(){
        return "springBootHtml/dataPage.html";
    }
    @GetMapping("/welcomePage")
    public String greeting() {
        return "springBootHtml/greeting";
    }
}


