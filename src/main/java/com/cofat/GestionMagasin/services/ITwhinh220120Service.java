package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Twhinh220120Entity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ITwhinh220120Service {

    void addTwhinh220120 (Twhinh220120Entity twhinh220120Entity);

    List<Twhinh220120Entity> getAllTwhinh220120Entity();

    void deleteTwhinh220120Entity(String oorg);

    Twhinh220120Entity getTwhinh220120EntityById(int id);

    Twhinh220120Entity updateTwhinh220120Entity(Twhinh220120Entity twhinh220120Entity);

}
