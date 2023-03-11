package com.cofat.GestionMagasin.controller;



import com.cofat.GestionMagasin.entities.Extraction1;
import com.cofat.GestionMagasin.repository.Extraction1Repository;
import com.cofat.GestionMagasin.services.Extraction1ServiceImpl;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/extraction1")
@CrossOrigin
public class Extraction1Controller {
    @Autowired
    private Extraction1ServiceImpl  extraction1Service;
    @Autowired
    private Extraction1Repository extraction1Repository ;
    private   List<Extraction1> Liste = new ArrayList<>() ;
    private Extraction1 extraction1;
   // @Modifying
  // @Transactional
   @GetMapping("/dte")
   @ResponseBody
    public List<Extraction1> getExtraction1ByDate(@RequestParam("dte") String dte) throws Exception {
        try {
            List<Extraction1> extraction1List= new ArrayList<>();
            extraction1List= extraction1Service.getExtraction1ByDate(dte);
            Extraction1 ee = new Extraction1();
            for (Extraction1 e:extraction1List ) {
                try{
                System.out.println("add");
                   extraction1Service.add(e);
                 /*     //  Extraction1 ee = new Extraction1();
                     ee = e.copy();
                     //extraction1Service.add(ee);
                    extraction1Repository.save(ee);
                    System.out.println("ajout1");
                    //
                   // extraction1Repository.save(e);
                    //System.out.println("ajout2");*/
                }
                catch (GenericJDBCException  b) {
                    System.out.println("ajout  " + b ) ;}

           }
            return extraction1List;
           // return extraction1Service.getExtraction1ByDate(dte);
        }
        catch (GenericJDBCException e) {throw new Exception("test "+ e ) ;}
    }

/*
    @PostMapping("/test")
    public String getExtraction1ByDateTest(String dte) {
         extraction1Service.getExtraction1ByDate("15-06-2022");
         return  "OK";
    }*/

    @Modifying
  //  @Transactional
    @GetMapping("/add")
    public void ajout (Extraction1 e){
        System.out.println("entrée1");
        e.setCode("test1");
        e.setMovementId("testtt");
        extraction1Service.add(e);
        System.out.println("entrée");
        extraction1Repository.save(extraction1);
        System.out.println("sortie");
    }

    @PostMapping("/dte")
    public void post(@RequestParam("dte") String dte) throws Exception {
        try {
            List<Extraction1> extraction1List= new ArrayList<>();
            extraction1List= extraction1Service.getExtraction1ByDate(dte);

            for (Extraction1 e:extraction1List ) {
                try{

                    extraction1Service.add(e);

                    e = e.copy();
                    extraction1Repository.save(e);
                    System.out.println("ajout1");
                    //  extraction1Service.add(e);
                    // extraction1Repository.save(e);
                    //System.out.println("ajout2");
                }
                catch (GenericJDBCException  b) {
                    System.out.println("ajout  " + b ) ;}

            }

            // return extraction1Service.getExtraction1ByDate(dte);
        }
        catch (GenericJDBCException e) {throw new Exception("test "+ e ) ;}
    }

}
