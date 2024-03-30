package com.sealed.sealed.service;

import org.springframework.stereotype.Service;

import com.sealed.sealed.model.Cat;
import com.sealed.sealed.model.Dog;

@Service
public class MainService {

  Cat cat = new Cat("meow");
  Dog dog = new Dog("woof");

  public void execute () {
    System.out.println("Dog name is: " + dog.name());
    System.out.println("Cat name is: " + cat.name());
  }
  
}
