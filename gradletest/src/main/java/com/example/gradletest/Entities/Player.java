package com.example.gradletest.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.dao.DataAccessException;
@Entity
@Table(name="player")
public class Player {
  @Id
  @Column(name = "id")
  private int id;
  @Column(name="name")
  private String name;
  @Column(name = "gender")
  private String gender;
  @Column(name="game")
  private String game;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getGame() {
    return game;
  }

  public void setGame(String game) {
    this.game = game;
  }
}
