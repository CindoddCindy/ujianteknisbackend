package com.ujianteknis.ujianteknisbackend.controller;

import com.ujianteknis.ujianteknisbackend.dto.UmurPasienResponse;
import com.ujianteknis.ujianteknisbackend.service.TestService;
import com.ujianteknis.ujianteknisbackend.service.UmurPasienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UmurPasienController {

  @Autowired
  UmurPasienService umurPasienService;

  @GetMapping("/calculateage/{dateofbirth}")
  public UmurPasienResponse getUsia(@PathVariable("dateofbirth") String dateofbirth) {
    return umurPasienService.getAge(dateofbirth);
  }

}
