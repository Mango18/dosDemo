package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class User2 {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id2;

  private String name2;
  
  private String email2;
  private String lastName2;
  
  public String getLastName2() {
	return lastName2;
}

public void setLastName2(String lastName2) {
	this.lastName2 = lastName2;
}

private boolean smoker;
  
  

  public Integer getId2() {
    return id2;
  }

  public void setId(Integer id2) {
    this.id2 = id2;
  }

  public String getName2() {
	  
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public String getEmail() {
    return email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }

/**
 * @return the smoker
 */
public boolean isSmoker() {
	return smoker;
}

/**
 * @param smoker the smoker to set
 */
public void setSmoker(boolean smoker) {
	this.smoker = smoker;
}
}