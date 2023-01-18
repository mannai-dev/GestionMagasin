package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Ttcibd004XxxEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ITtcibd004XxxService {
    void addTtcibd004Xxx (Ttcibd004XxxEntity ttcibd004XxxEntity);

    List<Ttcibd004XxxEntity> getAllTtcibd004XxxEntity();

    void deleteTtcibd004XxxEntity(String tCitt);

    Ttcibd004XxxEntity getTtcibd004XxxEntityByTCitt(String tCitt);

    Ttcibd004XxxEntity updateTtcibd004XxxEntity(Ttcibd004XxxEntity ttcibd004XxxEntity);


}
