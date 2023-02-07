package com.cofat.GestionMagasin.controller;



import com.cofat.GestionMagasin.entities.Extraction1;
import com.cofat.GestionMagasin.services.Extraction1ServiceImpl;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/extraction1")
@CrossOrigin
public class Extraction1Controller {
    @Autowired
    private Extraction1ServiceImpl  extraction1Service;

    @GetMapping("/dte")
    public List<Extraction1> getExtraction1ByDate(@RequestParam("dte") String dte) throws Exception {
        try {
            List<Extraction1> extraction1List= new ArrayList<>();
            extraction1List= extraction1Service.getExtraction1ByDate(dte);
            for (Extraction1 e:extraction1List ) {
                try{
                    extraction1Service.add(e);
                }
                catch (Exception b) {throw new Exception("ajout  "+ b ) ;}

            }
            return extraction1List;
           // return extraction1Service.getExtraction1ByDate(dte);
        }
        catch (GenericJDBCException e) {throw new Exception("test "+ e ) ;}
    }

  /*  @GetMapping("/test")
    public String getExtraction1ByDateTest(String dte) {
         extraction1Service.getExtraction1ByDate("15-06-2022");
         return  "OK";
    }*/

}
