package com.cofat.GestionMagasin.controller;

import com.cofat.GestionMagasin.entities.Ttcibd004XxxEntity;
import com.cofat.GestionMagasin.services.Ttcibd004XxxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/ttcibd004Xxx")
@CrossOrigin
public class Ttcibd004XxxContoller {
    @Autowired
    Ttcibd004XxxServiceImpl service;

    // http://localhost:8084/SpringMVC/ttcibd004Xxx/add
    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody Ttcibd004XxxEntity ttcibd004XxxEntity)
    {
        service.addTtcibd004Xxx(ttcibd004XxxEntity);
    }

    // http://localhost:8084/SpringMVC/ttcibd004Xxx/list
    @GetMapping("/list")
    @ResponseBody
    public List<Ttcibd004XxxEntity> get() {
        List<Ttcibd004XxxEntity> list = service.getAllTtcibd004XxxEntity();
        return list;
    }

    //  http://localhost:8084/SpringMVC/ttcibd004Xxx/find/
    @GetMapping("/find/{tCitt}")
    @ResponseBody
    public Ttcibd004XxxEntity getById(@PathVariable("tCitt") String tCitt)
    {
        return service.getTtcibd004XxxEntityByTCitt(tCitt);
    }

    // http://localhost:8084/SpringMVC/ttcibd004Xxx/delete/id
    @DeleteMapping("/delete/{tCitt}")

    public String delete(@PathVariable("tCitt") String tCitt) {
        service.deleteTtcibd004XxxEntity(tCitt);
        return "OK";
    }
}
