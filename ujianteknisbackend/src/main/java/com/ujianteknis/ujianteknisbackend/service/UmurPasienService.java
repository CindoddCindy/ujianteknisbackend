package com.ujianteknis.ujianteknisbackend.service;

import com.ujianteknis.ujianteknisbackend.dto.UmurPasienResponse;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

@Service
public class UmurPasienService {

  public UmurPasienResponse getAge(String tanggalLahir){
    LocalDate currentDate = LocalDate.now();
    LocalDate birthDay = LocalDate.parse(tanggalLahir);
    Period period = Period.between(birthDay, currentDate);

    return UmurPasienResponse.builder()
        .umur(":")
        .year(Period.ofYears(period.getYears()))
        .month(Period.ofMonths(period.getMonths()))
        .date(Period.ofDays(period.getDays()))
        .build();

  }
}
