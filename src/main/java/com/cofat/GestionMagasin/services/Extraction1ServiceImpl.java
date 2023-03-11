package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Extraction1;
//import com.cofat.GestionMagasin.repository.DboWmsMovementsRepository;
import com.cofat.GestionMagasin.repository.Extraction1Repository;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@Service
public class Extraction1ServiceImpl implements IExrtaction1Service {

    @Autowired
   Extraction1Repository extraction1Repository;


  /*  @Autowired
    DboWmsMovementsRepository dboWmsMovementsRepository ;
*/
    @Modifying
    @Transactional
    @Override
    public List<Extraction1> getExtraction1ByDate(String dte) {

        List<Extraction1> extractions = extraction1Repository.findExtraction1ByDate(dte);
        List<Extraction1> result = new ArrayList<>();
        for (Extraction1 extraction1 : extractions) {
            Extraction1 extraction = new Extraction1();
            System.out.println(extraction1);
            System.out.println(extraction);
            extraction.setCode(extraction1.getCode());
            extraction.setItem(extraction1.getItem());
            extraction.setTItem(extraction1.getTItem());
            extraction.setPalletBarcode(extraction1.getPalletBarcode());
            extraction.setMovementId(extraction1.getMovementId());
            extraction.setNum(extraction1.getNum());
            extraction.setProductId(extraction1.getProductId());
            extraction.setInitialQuantity(extraction1.getInitialQuantity());
            extraction.setQte(extraction1.getQte());
            extraction.setDate(extraction1.getDate());
            extraction.setNumOM(extraction1.getNumOM());
            extraction.setOrno(extraction1.getOrno());
            extraction.setTOrno(extraction1.getTOrno());
            extraction.setOset(extraction1.getOset());
            extraction.setTOset(extraction1.getTOset());
            extraction.setMovementType(extraction1.getMovementType());
            extraction.setJour(extraction1.getJour());
            System.out.println(extraction);
            extraction1Repository.save(extraction);
            result.add(extraction);
        }
        return result;


     //       return extraction1Repository.findExtraction1ByDate(dte);
           // return   dboWmsMovementsRepository.findExtraction1ByDate(dte);
    }

    @Modifying
    @Transactional
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
