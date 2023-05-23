package com.cofat.GestionMagasin.controller;

import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import com.cofat.GestionMagasin.entities.Twhinh200120;
import com.cofat.GestionMagasin.repository.Twhinh200120Repository;
import com.cofat.GestionMagasin.services.Twhinh200120ServiceImpl;
import com.cofat.GestionMagasin.services.Twhinh200ServiceImpl;
import com.cofat.GestionMagasin.services.Twhinh204ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/twhinh200120")
@CrossOrigin
public class Twhinh200120Controller {


    @Autowired
    Twhinh200120ServiceImpl service;
    @Autowired
    Twhinh200ServiceImpl twhinh200Service;
    Twhinh204ServiceImpl twhinh204Service;
    @Autowired
    Twhinh200120Repository repository;
    // http://localhost:8084/SpringMVC/twhinh200120/add
    @GetMapping("/add")
    @ResponseBody
    //public void add(@RequestBody Twhinh200120Entity twhinh200120Entity) {
    public void add(){
        //service.addTwhinh200120();
        twhinh200Service.nextTwhinh200120();
    }
    // http://localhost:8086/SpringMVC/twhinh200120/next
    @Transactional
    @GetMapping("/next")
    @ResponseBody
    public Twhinh200120Entity next() {
        return service.nextTwhinh200120();
    }
    // http://localhost:8084/SpringMVC/twhinh200120/list
    @GetMapping("/list")
    @ResponseBody
    public List<Twhinh200120> get() {
        List<Twhinh200120> list = twhinh200Service.getAllTwhinh200120();
       // List<Twhinh200120Entity> list = service.getAllTwhinh200120Entity();
        return list;
    }



    //  http://localhost:8084/SpringMVC/twhinh200120/find/
    @GetMapping("/find/{id}")
    @ResponseBody
    public Twhinh200120Entity getById(@PathVariable("id") Integer id)
    {
        return service.getTwhinh200120EntityById(id);
    }

    // http://localhost:8084/SpringMVC/twhinh200120/delete/tOorg
    @DeleteMapping("/delete/{tOorg}")

    public String delete(@PathVariable("tOorg") String tOorg) {
        service.deleteTwhinh200120Entity(tOorg);
        return "OK";
    }

    @Transactional
    @GetMapping("/getLast")
    @ResponseBody
    public Twhinh200120Entity getLast()
    {
        return repository.getLast();
    }


}
