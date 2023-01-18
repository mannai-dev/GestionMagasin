package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Twhinh220120Entity;
import com.cofat.GestionMagasin.repository.Twhinh220120Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Twhinh220120ServiceImpl implements ITwhinh220120Service{
    @Autowired
    Twhinh220120Repository twhinh220120Repository;
    @Override
    public void addTwhinh220120(Twhinh220120Entity twhinh220120Entity) {
            twhinh220120Repository.save(twhinh220120Entity);
    }

    @Override
    public List<Twhinh220120Entity> getAllTwhinh220120Entity() {
        return twhinh220120Repository.findAll();
    }

    @Override
    public void deleteTwhinh220120Entity(String oorg) {
            twhinh220120Repository.deleteByOorg(oorg);
    }

    @Override
    public Twhinh220120Entity getTwhinh220120EntityById(int id) {
        return twhinh220120Repository.findById(id);
    }

    @Override
    public Twhinh220120Entity updateTwhinh220120Entity(Twhinh220120Entity twhinh220120Entity) {
        return twhinh220120Repository.save(twhinh220120Entity);
    }
}
