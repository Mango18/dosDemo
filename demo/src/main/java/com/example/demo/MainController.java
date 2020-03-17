package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;

@Controller 
@RequestMapping(path="/demo") 
public class MainController {
  @Autowired 
         
  private UserRepository userRepository;

  @PostMapping(path="/add") 
  public @ResponseBody String addNewUser ( String name
      ,  String email,  String LastName) {
    
    User n = new User();
    n.setName(name);
    n.setEmail(email);
    n.setLastName(LastName);
    //n.isSmoker();
    userRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
}