package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Twhinh204120Entity;
import com.cofat.GestionMagasin.repository.Twhinh204120Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Twhinh204120ServiceImpl implements ITwhinh204120Service {
    @Autowired
    Twhinh204120Repository twhinh204120Repository;
    @Override
    public void addTwhinh204120(Twhinh204120Entity twhinh204120Entity) {
        twhinh204120Repository.save(twhinh204120Entity);
    }

    @Override
    public List<Twhinh204120Entity> getAllTwhinh204120Entity() {
        return twhinh204120Repository.findAll();
    }

    @Override
    public void deleteTwhinh204120Entity(String tOorg) {
        twhinh204120Repository.deleteByOorg(tOorg);

    }

    @Override
    public Twhinh204120Entity getTwhinh204120EntityById(Integer id) {
        return twhinh204120Repository.findTwhinh204120EntityById(id);
    }

    @Override
    public Twhinh204120Entity updateTwhinh204120Entity(Twhinh204120Entity twhinh204120Entity) {
        return twhinh204120Repository.save(twhinh204120Entity);
    }
}
