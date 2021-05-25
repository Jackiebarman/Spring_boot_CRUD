package com.example.gradletest.service;

import com.example.gradletest.Entities.Player;
import com.example.gradletest.Entities.UserEntity;
import com.example.gradletest.Repositories.PlayerRepo;
import com.example.gradletest.Repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserentityService {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PlayerRepo playerRepo;

  public List<UserEntity> getUsers(){
    List<UserEntity> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

    public List<Player> getPlayers() {
      List<Player> players = new ArrayList<>();
      playerRepo.findAll().forEach(players::add);
      return players;
    }

  public UserEntity getUserbyId(int id) {
    return userRepository.findById(id).orElse(null);
  }


  @Transactional
  public UserEntity addUser(UserEntity user){
    return userRepository.save(user);
    //return "Data Added successfully";
  }
//@Transactional
//public void addUsers(List<UserEntity> users){
//  for (UserEntity user : users){ ////return UserRepository.saveAll(users);
//    userRepository.save(user);
//  }
//}
  public String deleteUser(int id)
  {
    userRepository.deleteById(id);
    return "User removed successfully!!!";
  }

  public UserEntity updateUser(UserEntity user) {
    UserEntity existingProduct = userRepository.findById(user.getID()).orElse(null);
    //existingProduct.setID(user.getID());
    existingProduct.setType(user.getType());
    existingProduct.setColor(user.getColor());
    existingProduct.setLocation(user.getLocation());
    existingProduct.setDate(user.getDate());

    userRepository.save(existingProduct);
    return existingProduct;
  }

  //CREATE THE TABLE
//  public void createTable(){
//    var query = "CREATE TABLE student(id int,name varchar(50))";
//    // To fire this query
//    int update = this.userRepository.;
//    System.out.println(update);
//  }

}
