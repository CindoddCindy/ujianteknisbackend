package com.ujianteknis.ujianteknisbackend.dto;

import jdk.dynalink.beans.StaticClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KamarOperasiRequest {

  public  String tanggalBooking = "01/01/2022";

 public Date durasi;
}
