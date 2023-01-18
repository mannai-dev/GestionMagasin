package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Twhinh204120Entity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ITwhinh204120Service {
    void addTwhinh204120 (Twhinh204120Entity  twhinh204120Entity);

    List<Twhinh204120Entity> getAllTwhinh204120Entity();

    void deleteTwhinh204120Entity(String oorg);

    Twhinh204120Entity getTwhinh204120EntityById(Integer id);

    Twhinh204120Entity updateTwhinh204120Entity(Twhinh204120Entity twhinh204120Entity);

}
