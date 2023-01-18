package com.cofat.GestionMagasin.controller;

import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import com.cofat.GestionMagasin.services.Twhinh200120ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/twhinh200120")
@CrossOrigin
public class Twhinh200120Controller {


    @Autowired
    Twhinh200120ServiceImpl service;

    // http://localhost:8084/SpringMVC/twhinh200120/add
    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody Twhinh200120Entity twhinh200120Entity) {
        service.addTwhinh200120(twhinh200120Entity);
    }
    // http://localhost:8084/SpringMVC/twhinh200120/list
    @GetMapping("/list")
    @ResponseBody
    public List<Twhinh200120Entity> get() {
        List<Twhinh200120Entity> list = service.getAllTwhinh200120Entity();
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
}
