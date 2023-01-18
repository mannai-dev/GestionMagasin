package com.cofat.GestionMagasin.controller;


import com.cofat.GestionMagasin.entities.DboWmsProductsEntity;
import com.cofat.GestionMagasin.services.DboWmsProductsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
@CrossOrigin
public class DboWmsProductsController {
    @Autowired
    DboWmsProductsServiceImpl dboWmsProductsService;


    //http://localhost:8084/SpringMVC/products/add
    @PostMapping("/add/")
    @ResponseBody
    public void add(@RequestBody DboWmsProductsEntity dboWmsProductsEntity)
    {
        dboWmsProductsService.addDboWmsProducts(dboWmsProductsEntity);
    }

    //http://localhost:8084/SpringMVC/products/list
    @GetMapping("/list")
    @ResponseBody
    public List<DboWmsProductsEntity> get() {
        List<DboWmsProductsEntity> list = dboWmsProductsService.getAllDboWmsProductsEntity();
        return list;
    }

    //http://localhost:8084/SpringMVC/products/find/
    @GetMapping("/find/{id}")
    @ResponseBody
    public DboWmsProductsEntity getById(@PathVariable("id") String id)
    {
        return dboWmsProductsService.getDboWmsProductsEntityById(id);
    }

    //http://localhost:8084/SpringMVC/products/delete/id
    @DeleteMapping("/delete/{id}")

    public String delete(@PathVariable("id") String id) {
        dboWmsProductsService.deleteDboWmsProductsEntity(id);
        return "OK";
    }
}
