package com.yi.spring6tomcat10.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
        System.out.printf("안녕...!!!!!!!!!!!!!!!!!!");
    }
}
