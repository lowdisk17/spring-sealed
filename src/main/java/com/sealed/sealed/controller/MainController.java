package com.sealed.sealed.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sealed.sealed.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @Autowired
  MainService service;

  @GetMapping("service")
  public String getMethodName() {
    service.execute();
    return "Done";
  }
  
}
