package com.ujianteknis.ujianteknisbackend.service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class KamarOperasiService {

  public Boolean  getValue(String [] durasi) {
    try {
      durasi = new String[]{"10:00","15:00"};
      boolean found = false;
      String jam10 = "10:00";
      String jam3="15:00";

      for(String x : durasi){
        if( x ==  jam10 || x == jam3){
          found = true;
          break;
        }
      }
      return found;
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }


}
