package com.ujianteknis.ujianteknisbackend.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

  String username = "Hello My Name";

  public String returnName(){
    return username;
  }
}
