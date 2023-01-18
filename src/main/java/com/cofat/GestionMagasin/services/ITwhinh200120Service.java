package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ITwhinh200120Service {
    void addTwhinh200120 (Twhinh200120Entity twhinh200120Entity);

    List<Twhinh200120Entity> getAllTwhinh200120Entity();

    void deleteTwhinh200120Entity(String tOorg);

    Twhinh200120Entity getTwhinh200120EntityById(Integer id);
    Twhinh200120Entity updateTwhinh200120Entity(Twhinh200120Entity twhinh200120Entity);

    Twhinh200120Entity FindByTOrno(Twhinh200120Entity twhinh200120Entity);
}
