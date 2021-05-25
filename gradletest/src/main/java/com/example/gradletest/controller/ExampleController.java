package com.example.gradletest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
  private final String CONTEXT = "/api/v1/User/{id}";
  @GetMapping(value = CONTEXT)
  @ResponseStatus(HttpStatus.OK)
  public String greeting(
      @PathVariable Long id,
      @RequestParam(required = true, defaultValue = "Unknown") String name,
      @RequestParam(required = false) String number) {
    if(number == null){
      return "Example content for " + name + " to the ID: "+id;
    }
    int num = Integer.parseInt(number);
    return "Example content for " + name + " with number " + (num + 3) + " to the ID: "+id;
  }

}
