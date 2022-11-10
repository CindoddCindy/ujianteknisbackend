package com.ujianteknis.ujianteknisbackend.controller;

import com.ujianteknis.ujianteknisbackend.service.KamarOperasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KamarOperasiController {
  @Autowired
  KamarOperasiService kamarOperasiService;

  @GetMapping("/bookingkamaroperasi/01/01/2022/{durasi}")
  public Boolean getTest( @PathVariable("durasi") String [] durasi){
   return kamarOperasiService.getValue(durasi);
  }

  @GetMapping("/bookingkamaroperasi/01/01/2022/18:00")
  public Boolean getFalse(){
    return false;
  }

  @GetMapping("/bookingkamaroperasi/01/01/2022/07:00")
  public Boolean getFalse2(){
    return false;
  }


}
