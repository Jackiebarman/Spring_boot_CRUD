package com.example.gradletest.service;
import com.example.gradletest.Resources.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class UserService {
  private List<User> users = new ArrayList<>(Arrays.asList(
      new User("Jyoti"),
      new User("Bhajan"),
      new User("Jeevan")
  )
  );
  public List<User> getUsers(){
    return users;
  }

  public void addUser(User user){
    users.add(user);
  }

  public String edit(User user){
    users.stream().filter(e -> e.getID()==user.getID()).forEach(e ->{
      e.setName(user.getName());
    });
   // return users.edit(user);
    return "Name Updated Successfully";
  }


}
