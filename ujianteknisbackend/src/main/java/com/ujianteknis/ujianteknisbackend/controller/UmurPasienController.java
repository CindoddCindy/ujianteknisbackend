package com.ujianteknis.ujianteknisbackend.controller;

import com.ujianteknis.ujianteknisbackend.dto.UmurPasienResponse;
import com.ujianteknis.ujianteknisbackend.service.TestService;
import com.ujianteknis.ujianteknisbackend.service.UmurPasienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class UmurPasienController {

  @Autowired
  UmurPasienService umurPasienService;

  @GetMapping("/calculateage/28Oktober1983")
  public UmurPasienResponse getUsia() {
    return umurPasienService.getAge();
  }

}
