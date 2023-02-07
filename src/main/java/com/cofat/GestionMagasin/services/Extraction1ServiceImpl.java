package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Extraction1;
import com.cofat.GestionMagasin.repository.Extraction1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Extraction1ServiceImpl implements IExrtaction1Service {

    @Autowired
    Extraction1Repository extraction1Repository;

    @Transactional
    @Override
    public List<Extraction1> getExtraction1ByDate(String dte) {
        return extraction1Repository.findExtraction1ByDate(dte);
    }

    @Override
    public void add (Extraction1 extraction1){
        extraction1Repository.save(extraction1);
    }

/*
    @Transactional
    @Override
    public void getExtraction1ByDate(String dte) {
         extraction1Repository.findExtraction1ByDate(dte);
    }
*/


}
