package com.demo.cs.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "users")

@Getter
@Setter
@NoArgsConstructor
public class User {
  @Id
  String id;
  String name;
  String age;

  public User(String name, String age) {
    this.name = name;
    this.age = age;
  }

}
