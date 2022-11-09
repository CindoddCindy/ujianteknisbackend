package com.ujianteknis.ujianteknisbackend.service;

import com.ujianteknis.ujianteknisbackend.dto.AlergyObatResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlergiObatService {

  public AlergyObatResponse getAlergy(){
    List<String> obat = new ArrayList<>();
    obat.add("obat : proris");
    return  AlergyObatResponse.builder()
        .pasien("")
        .resep(obat)
        .build();
  }
}
