package com.cofat.GestionMagasin.controller;

import com.cofat.GestionMagasin.entities.Ttcibd001120Entity;
import com.cofat.GestionMagasin.services.Ttcibd001120ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ttcibd001120")
@CrossOrigin
public class Ttcibd001120Controller {

    @Autowired
    Ttcibd001120ServiceImpl service;

    // http://localhost:8084/SpringMVC/ttcibd001120/add
    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody Ttcibd001120Entity ttcibd001120Entity) {
        service.addTtcibd001120(ttcibd001120Entity);
    }
    // http://localhost:8084/SpringMVC/ttcibd001120/list
    @GetMapping("/list")
    @ResponseBody
    public List<Ttcibd001120Entity> get() {
        List<Ttcibd001120Entity> list = service.getAllTtcibd001120Entity();
        return list;
    }



    //  http://localhost:8084/SpringMVC/ttcibd001120/find/
    @GetMapping("/find/{tItem}")
    @ResponseBody
    public Ttcibd001120Entity getById(@PathVariable("tItem") String tItem)
    {
        return service.getTtcibd001120EntityByTItem(tItem);
    }

    // http://localhost:8084/SpringMVC/ttcibd001120/delete/tItem
    @DeleteMapping("/delete/{tItem}")

    public String delete(@PathVariable("tItem") String tItem) {
        service.deleteTtcibd001120Entity(tItem);
        return "OK";
    }
}
