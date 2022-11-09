package com.ujianteknis.ujianteknisbackend.controller;

import com.ujianteknis.ujianteknisbackend.dto.AlergyObatResponse;
import com.ujianteknis.ujianteknisbackend.dto.KamarOperasiRespon;
import com.ujianteknis.ujianteknisbackend.service.AlergiObatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;

@RestController
public class AlergiObatController {

  @Autowired
  AlergiObatService alergiObatService;

  @GetMapping("/validasialergiobat")
  public AlergyObatResponse getTest() throws ParseException {
    return alergiObatService.getAlergy();
  }
}
