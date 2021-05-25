package com.example.gradletest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @RequestMapping("/")

  public String getHello(){
          return "Hello, My First Spring boot project is READY!!!";
        }


}
