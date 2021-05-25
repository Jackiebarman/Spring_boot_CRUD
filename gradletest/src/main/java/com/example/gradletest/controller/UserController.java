package com.example.gradletest.controller;

import com.example.gradletest.Resources.User;
import com.example.gradletest.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  private final String CONTEXT = "/api/v1/User";
  @Autowired
  private UserService userService;

  @GetMapping(value = CONTEXT)
  @ResponseStatus(HttpStatus.OK)
  public List<User> getUsers(){
    return userService.getUsers();
  }

  @PostMapping(value = CONTEXT)
  @ResponseStatus(HttpStatus.CREATED)
  public String createUser(@RequestBody User user){
    userService.addUser(user);
    return "New Employee added successfully";
  }

  @PutMapping(value = CONTEXT)
  public String edit(@RequestBody User user){
    return userService.edit(user);
    //return "New Employee added successfully";
  }





}
