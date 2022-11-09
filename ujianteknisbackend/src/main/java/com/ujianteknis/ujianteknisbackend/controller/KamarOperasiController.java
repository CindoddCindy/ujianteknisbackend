package com.ujianteknis.ujianteknisbackend.controller;

import com.ujianteknis.ujianteknisbackend.dto.KamarOperasiRespon;
import com.ujianteknis.ujianteknisbackend.service.KamarOperasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;

@RestController
public class KamarOperasiController {
  @Autowired
  KamarOperasiService kamarOperasiService;

  @GetMapping("/bookingkamaroperasi/{bookingdate}/{durasi}")
  public KamarOperasiRespon getTest(@PathVariable("bookingdate") String bookingdate, @PathVariable("durasi")Date durasi) throws ParseException {
    return kamarOperasiService.getRespon(bookingdate,durasi);
  }
}
