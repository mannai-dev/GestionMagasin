package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import com.cofat.GestionMagasin.repository.Twhinh200120Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Twhinh200120ServiceImpl implements ITwhinh200120Service {

    @Autowired
    Twhinh200120Repository twhinh200120Repository;

    @Override
    public void addTwhinh200120(Twhinh200120Entity twhinh200120Entity) {
        twhinh200120Repository.save(twhinh200120Entity);
    }

    @Override
    public List<Twhinh200120Entity> getAllTwhinh200120Entity() {
        return twhinh200120Repository.findAll();
    }

    @Override
    public void deleteTwhinh200120Entity(String tOorg) {
        twhinh200120Repository.deleteByTOorg(tOorg);

    }

    @Override
    public Twhinh200120Entity getTwhinh200120EntityById(Integer id) {
        return twhinh200120Repository.findById(id);
    }

    @Override
    public Twhinh200120Entity updateTwhinh200120Entity(Twhinh200120Entity twhinh200120Entity) {
        return twhinh200120Repository.save(twhinh200120Entity);
    }

    @Override
    public Twhinh200120Entity FindByTOrno(Twhinh200120Entity twhinh200120Entity) {
        return null;
    }


}
