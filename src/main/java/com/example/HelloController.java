package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by christerhansen on 14.10.15.
 */
@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/")
    public String root(){
        return "home";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
