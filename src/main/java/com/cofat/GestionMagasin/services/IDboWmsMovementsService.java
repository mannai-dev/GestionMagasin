package com.cofat.GestionMagasin.services;


import com.cofat.GestionMagasin.entities.DboWmsMovementsEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IDboWmsMovementsService {

    void addDboWmsMovements (DboWmsMovementsEntity dboWmsMovementsEntity);

    List<DboWmsMovementsEntity> getAllDboWmsMovementsEntity();

    void deleteDboWmsMovementsEntity(String id);

    DboWmsMovementsEntity getDboWmsMovementsEntityById(String id);

    DboWmsMovementsEntity updateDboWmsMovementsEntity(DboWmsMovementsEntity dboWmsMovementsEntity);

}
