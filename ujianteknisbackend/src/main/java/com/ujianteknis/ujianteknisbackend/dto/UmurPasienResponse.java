package com.ujianteknis.ujianteknisbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Period;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UmurPasienResponse {
  public String umur;
  public Period year;
  public Period month;
  public Period date;

}
