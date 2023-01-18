package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.DboWmsMovementsEntity;
import com.cofat.GestionMagasin.repository.DboWmsMovementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DboWmsMovementsServiceImpl implements IDboWmsMovementsService{
    @Autowired
    private DboWmsMovementsRepository dboWmsMovementsRepository;

    @Override
    public void addDboWmsMovements(DboWmsMovementsEntity dboWmsMovementsEntity) {
      dboWmsMovementsRepository.save(dboWmsMovementsEntity);
    }

    @Override
    public List<DboWmsMovementsEntity> getAllDboWmsMovementsEntity() {
        return dboWmsMovementsRepository.findAll();
    }

    @Override
    public void deleteDboWmsMovementsEntity(String id) {
        dboWmsMovementsRepository.deleteDboWmsMovementsEntitiesById(id);
    }

    @Override
    public DboWmsMovementsEntity getDboWmsMovementsEntityById(String id) {
        return dboWmsMovementsRepository.findDboWmsMovementsEntitiesById(id);
    }

    @Override
    public DboWmsMovementsEntity updateDboWmsMovementsEntity(DboWmsMovementsEntity dboWmsMovementsEntity) {
        return dboWmsMovementsRepository.save(dboWmsMovementsEntity);
    }
}
