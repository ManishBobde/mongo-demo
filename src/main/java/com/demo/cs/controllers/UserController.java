package com.demo.cs.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.cs.entities.User;
import com.demo.cs.repositories.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("/users")
  public List<User> getAllTodos() {
    return userRepository.findAll();
  }

  @GetMapping("/createUser")
  public User createTodo() {
    User user = new User("Hitesh", "30");
    return userRepository.save(user);
  }

}
