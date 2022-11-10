package com.ujianteknis.ujianteknisbackend.controller;

import com.ujianteknis.ujianteknisbackend.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  TestService testService;

  @GetMapping("/test")
  public String getTest() {
    return testService.returnName();
  }

  }
