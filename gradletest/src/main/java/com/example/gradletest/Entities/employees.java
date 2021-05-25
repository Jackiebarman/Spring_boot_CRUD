package com.example.gradletest.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class employees {
  @Id
  @Column(name = "ID")
  private int id;
  @Column(name="NAME")
  private String name;
  @Column(name = "AGE")
  private int age;
  @Column(name="EMAIL")
  private String email;
  @Column(name="SALARY")
  private  double salary;

  public int getID(){ return id;}
  public void setID(int id) { this.id = id; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public double getSalary() { return salary; }
  public void setSalary(double salary) { this.salary = salary; }


  // public void setName(String name) { this.name = name; }

}