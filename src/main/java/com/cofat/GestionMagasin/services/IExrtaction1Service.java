package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Extraction1;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface IExrtaction1Service {


    @Transactional
    List<Extraction1> getExtraction1ByDate(String dte);

    void add( Extraction1 extraction1);

}
