package com.ujianteknis.ujianteknisbackend.service;

import com.ujianteknis.ujianteknisbackend.dto.KamarOperasiRequest;
import com.ujianteknis.ujianteknisbackend.dto.KamarOperasiRespon;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Timestamp;
import java.util.*;
import java.text.*;

@Service
public class KamarOperasiService {

  KamarOperasiRequest kamarOperasiRequest;

  Timestamp startjamSepuluh=Timestamp.valueOf("2022-01-01 10:00:00.00");
  Timestamp startjamTiga=Timestamp.valueOf("2022-01-01 15:00:00.00");
  Timestamp startjamEnam=Timestamp.valueOf("2022-01-01 18:00:00.00");
  Timestamp startjamTujuh=Timestamp.valueOf("2022-01-01 07:00:00.00");

  Timestamp endJamTiga = Timestamp.valueOf("2022-01-01 15:00:00.00");
  Timestamp endJamDua = Timestamp.valueOf("2022-01-01 14:00:00.00");
  Timestamp endJam10 = Timestamp.valueOf("2022-01-01 07:00:00.00");

//true
  Date startNo1 = new Date(startjamSepuluh.getTime());
  Date endNo1 = new Date(endJamTiga.getTime());
//false
  Date startNo2 = new Date(startjamTiga.getTime());
  Date endNo2 = new Date(startjamEnam.getTime());

  //false
  Date startNo3 = new Date(startjamTiga.getTime());
  Date endNo3 = new Date(endJamTiga.getTime());

  //false
  Date startNo4 = new Date(startjamTujuh.getTime());
  Date endNo4 = new Date(endJam10.getTime());


  public Integer getMinutesBetweenTwoDates1(Date startNo1, Date endNo1) {
    long diff = Math.abs(endNo1.getTime() - startNo1.getTime());
    return (int) (diff / 1000 / 60);
  }
  public Integer getMinutesBetweenTwoDates2(Date startNo2, Date endNo2) {
    long diff = Math.abs(endNo2.getTime() - startNo2.getTime());
    return (int) (diff / 1000 / 60);
  }
  public Integer getMinutesBetweenTwoDates3(Date startNo3, Date endNo3) {
    long diff = Math.abs(endNo3.getTime() - startNo3.getTime());
    return (int) (diff / 1000 / 60);
  }
  public Integer getMinutesBetweenTwoDates4(Date startNo4, Date endNo4) {
    long diff = Math.abs(endNo4.getTime() - startNo4.getTime());
    return (int) (diff / 1000 / 60);
  }
  public  KamarOperasiRespon getRespon(String bookingdate, Date durasi){
    boolean returnNilai=false;
    if(getMinutesBetweenTwoDates1(startNo1, endNo1) != null){
      if(durasi.equals(startNo1) && bookingdate!=null) {
        returnNilai = true;
      }
    }
    if(getMinutesBetweenTwoDates2(startNo2,endNo2) != null){
      if(durasi.equals(startNo2) && bookingdate != null){
        returnNilai= true;
      }
    }
    if (getMinutesBetweenTwoDates3(startNo3, endNo3) != null){
      if(durasi.equals(startNo3) && bookingdate !=null){
        returnNilai=false;
      }
    }

    if (getMinutesBetweenTwoDates4(startNo4,endNo4) != null){
      if(durasi.equals(startNo4) && bookingdate != null){
        returnNilai=false;
      }
    }
    return KamarOperasiRespon.builder()
        .result(returnNilai)
        .build();
  }
}
