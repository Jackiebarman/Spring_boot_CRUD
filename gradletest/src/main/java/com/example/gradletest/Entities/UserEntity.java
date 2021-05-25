package com.example.gradletest.Entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.dao.DataAccessException;

@Entity
@Table(name = "playground")
public class UserEntity {
  @Id
  @Column(name = "equip_id")
  private int id;
  @Column(name="type")
  private String type;
  @Column(name = "color")
  private String color;
  @Column(name="location")
  private String location;
  @Column(name="install_date")
  private Date date;

  public int getID(){ return id; }
  public void setID(int id) { this.id = id; }
  public String getType() { return type; }
  public void setType(String type) { this.type = type; }
  public String getColor() { return color; }
  public void setColor(String color) { this.color = color; }
  public String getLocation() { return location; }
  public void setLocation(String location) { this.location = location; }
  public Date getDate() { return date; }
  public void setDate(Date date) { this.date = date; }


  // public void setName(String name) { this.name = name; }

}