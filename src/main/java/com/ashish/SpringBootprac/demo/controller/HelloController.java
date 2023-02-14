package com.ashish.SpringBootprac.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/")
    public String show(){
      return "Welcome to Springboot tutorial by Ash";
    }
}
