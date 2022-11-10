package com.ujianteknis.ujianteknisbackend.service;

import com.ujianteknis.ujianteknisbackend.dto.PenggajianResponse;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PenggajianService {

  public PenggajianResponse getGajiIndo(){
    String formatter = "##,###,###.##";
    DecimalFormat df = new DecimalFormat(formatter);

    Double hitungGajiIndo= Double.valueOf(37.75 / 12);
   Double hitungGajiVietnam = Double.valueOf (21.35 / 12) ;
   Map<String,Double> komponengaji = new HashMap<>();

   komponengaji.put("Indonesia Salary :", Double.valueOf(df.format(hitungGajiIndo)));
   komponengaji.put("Vietnam Salary :",Double.valueOf(df.format(hitungGajiVietnam)));
   return PenggajianResponse.builder()
       .employee("employee salary")
       .komponengaji(komponengaji)
       .build();
  }
}
