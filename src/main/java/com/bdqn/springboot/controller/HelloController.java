package com.bdqn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello.html")
    public String Hello(HttpServletRequest req){
        req.setAttribute("name","123233");
        return "hello";
    }
}
