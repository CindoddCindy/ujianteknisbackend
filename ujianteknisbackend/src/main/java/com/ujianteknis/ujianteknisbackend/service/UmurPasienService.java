package com.ujianteknis.ujianteknisbackend.service;

import com.ujianteknis.ujianteknisbackend.dto.UmurPasienResponse;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UmurPasienService {

  public UmurPasienResponse getAge(){
    LocalDate currentDate = LocalDate.now();
    LocalDate dob = LocalDate.of(1983, 10, 28);
    Period period = Period.between(dob, currentDate);
    Map<String,Integer> umur = new HashMap<>();
    umur.put("year :", period.getYears());
    umur.put("month :", period.getMonths());
    umur.put("date :" ,period.getDays());

    return UmurPasienResponse.builder()
        .umur(umur)
        .build();

  }
}
