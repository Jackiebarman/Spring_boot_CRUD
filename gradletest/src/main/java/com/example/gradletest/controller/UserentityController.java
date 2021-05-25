package com.example.gradletest.controller;

import com.example.gradletest.Entities.Player;
import com.example.gradletest.Entities.UserEntity;
import com.example.gradletest.Repositories.PlayerRepo;
import com.example.gradletest.Repositories.UserRepository;
import com.example.gradletest.service.UserentityService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserentityController {
  @Autowired
  private UserentityService userentityService;

  @Autowired
  private UserRepository userRepository;
//
//  @Autowired
//  private PlayerRepo playerrepo;

  @GetMapping("/getPlaygrounds")
  @ResponseStatus(HttpStatus.OK)
  public List<UserEntity> getUsers(){
    return userentityService.getUsers();
  }

  @GetMapping("/getPlayground/{id}")
  public UserEntity getUserbyId(@PathVariable int id){
    return userentityService.getUserbyId(id);
  }


  @GetMapping("/getPlayers")
  public List<Player> getPlayers(){
  return userentityService.getPlayers();
  }

  @DeleteMapping("/delete/{id}")
  public void deleteUser(@PathVariable int id){
     userentityService.deleteUser(id);
  }

  @PostMapping("/addPlayground")
  @ResponseStatus(HttpStatus.CREATED)
  public UserEntity addUser(@RequestBody UserEntity u){
    return userentityService.addUser(u);
  }

//  @PostMapping("/addProducts")
//  public List<Product> addProducts(@RequestBody List<Product> products) {
//    return service.saveProducts(products);
//  }

//  @PostMapping("/addPlayer")
//  @ResponseStatus(HttpStatus.CREATED)
//  public Player addPlayer(@RequestBody Player player){
//    return playerrepo.save(player);
//  }


  @PutMapping("/update")
  public UserEntity updateUser(@RequestBody UserEntity user){
    return userentityService.updateUser(user);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<UserEntity> updateUser(@PathVariable int id,@RequestBody UserEntity user){
    //return userentityService.updateUser(user);
      UserEntity existingProduct = userRepository.findById(id).orElse(null);
      //existingProduct.setID(user.getID());
      existingProduct.setType(user.getType());
      existingProduct.setColor(user.getColor());
      existingProduct.setLocation(user.getLocation());
      existingProduct.setDate(user.getDate());

      UserEntity updatedPlayground= userRepository.save(existingProduct);
      return ResponseEntity.ok(updatedPlayground);
  }


}















////    List<Player> players = new ArrayList<>();
////    playerrepo.findAll().forEach(players::add);
////    return players;