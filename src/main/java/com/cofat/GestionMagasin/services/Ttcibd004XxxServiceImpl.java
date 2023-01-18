package com.cofat.GestionMagasin.services;


import com.cofat.GestionMagasin.entities.Ttcibd004XxxEntity;
import com.cofat.GestionMagasin.repository.Ttcibd004XxxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ttcibd004XxxServiceImpl implements ITtcibd004XxxService {

    @Autowired
    Ttcibd004XxxRepository ttcibd004XxxRepository;
  //  private Ttcibd004XxxEntity ttcibd004XxxEntity;

    @Override
    public void addTtcibd004Xxx(Ttcibd004XxxEntity ttcibd004XxxEntity) {
      ttcibd004XxxRepository.save(ttcibd004XxxEntity);
    }

    @Override
    public List<Ttcibd004XxxEntity> getAllTtcibd004XxxEntity() {
        return ttcibd004XxxRepository.findAll();
    }

    @Override
    public void deleteTtcibd004XxxEntity(String tCitt) {
         ttcibd004XxxRepository.deleteById(tCitt);
    }

    @Override
    public Ttcibd004XxxEntity getTtcibd004XxxEntityByTCitt(String tCitt) {
        return ttcibd004XxxRepository.findTtcibd004XxxEntityById(tCitt);
    }

    @Override
    public Ttcibd004XxxEntity updateTtcibd004XxxEntity(Ttcibd004XxxEntity ttcibd004XxxEntity) {
        return ttcibd004XxxRepository.save(ttcibd004XxxEntity);
    }
}
