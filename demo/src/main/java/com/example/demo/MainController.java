package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;


@Controller 
@RequestMapping(path="/demo") 
public class MainController {
  @Autowired 
         
  private UserRepository userRepository;

  @PostMapping(path="/add")  
  public @ResponseBody String addNewUser (  @RequestParam String name, String lastName, String email ) {
	  
    User user= new User();
    user.setName(name);
    user.setLastName(lastName);
    user.setEmail(email);
    userRepository.save(user);
      return "Saved";
    }
  

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
  @DeleteMapping(path="/delete/{id}")
  public  void delete(@RequestParam int id) {
	  userRepository.deleteById(id); 

  }

  
  
}