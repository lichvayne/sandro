package com.example.mywebapplication.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebController {
    @GetMapping("/result")
    public String result(){
        return "This Is My Result: Sandro Mekoshkishvili";
    }
}
