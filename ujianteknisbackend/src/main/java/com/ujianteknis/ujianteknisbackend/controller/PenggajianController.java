package com.ujianteknis.ujianteknisbackend.controller;

import com.ujianteknis.ujianteknisbackend.dto.PenggajianResponse;
import com.ujianteknis.ujianteknisbackend.dto.UmurPasienResponse;
import com.ujianteknis.ujianteknisbackend.service.PenggajianService;
import com.ujianteknis.ujianteknisbackend.service.UmurPasienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PenggajianController {

  @Autowired
  PenggajianService penggajianService;

  @GetMapping("/hitunggaji")
  public PenggajianResponse getGaji() {
    return penggajianService.getGajiIndo();
  }
}
