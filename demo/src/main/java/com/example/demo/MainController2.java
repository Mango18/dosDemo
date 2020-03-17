package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.models.User2;
import com.example.demo.repository.UserRepossitory2;


@Controller
@RequestMapping(path="/demo2") 
public class MainController2 {
	
	@Autowired 
    
	  private UserRepossitory2 userRepossitory2;



@PostMapping(path="/add2") 
public @ResponseBody String addNewUser (@RequestParam String name2
    , @RequestParam String email2, @RequestParam String LastName2,@RequestParam boolean Smoker2) {
  
  User2 n2 = new User2();
  n2.setName2(name2);
  n2.setEmail2(email2);
  n2.setLastName2(LastName2);
  n2.isSmoker();
  userRepossitory2.save(n2);
  return "Saved2";
}


@GetMapping(path="/all2")
public @ResponseBody Iterable<User2> getAllUsers() {
  // This returns a JSON or XML with the users
  return userRepossitory2.findAll();
}

}
