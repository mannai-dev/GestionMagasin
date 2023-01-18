package com.cofat.GestionMagasin.controller;

import com.cofat.GestionMagasin.entities.DboWmsMovementsEntity;
import com.cofat.GestionMagasin.services.DboWmsMovementsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/movements")
@CrossOrigin
public class DboWmsMovementsController {

    @Autowired
    DboWmsMovementsServiceImpl dboWmsMovementsService;


    // http://localhost:8084/SpringMVC/movements/add
    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody DboWmsMovementsEntity dboWmsMovementsEntity)
    {
        dboWmsMovementsService.addDboWmsMovements(dboWmsMovementsEntity);
    }

    // http://localhost:8084/SpringMVC/movements/list
    @GetMapping("/list")
    @ResponseBody
    public List<DboWmsMovementsEntity> get() {
        List<DboWmsMovementsEntity> list = dboWmsMovementsService.getAllDboWmsMovementsEntity();
        return list;
    }

    //  http://localhost:8084/SpringMVC/movements/find/
    @GetMapping("/find/{id}")
    @ResponseBody
    public DboWmsMovementsEntity getById(@PathVariable("id") String id)
    {
        return  dboWmsMovementsService.getDboWmsMovementsEntityById(id);
    }

    // http://localhost:8084/SpringMVC/movements/delete/id
    @DeleteMapping("/delete/{id}")

    public String delete(@PathVariable("id") String id) {
        dboWmsMovementsService.deleteDboWmsMovementsEntity(id);
        return "OK";
    }
}
