package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.wmsMovementsEntity;
import com.cofat.GestionMagasin.repository.wmsMovementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


@Service
public class wmsMovementsServiceImpl implements IwmsMovementsService {
    @Autowired
    wmsMovementsRepository movementsRepository;

    @Override
    public void addDboWmsMovements(wmsMovementsEntity dboWmsMovementsEntity) {
        movementsRepository.save(dboWmsMovementsEntity);
    }

    @Override
    public List<wmsMovementsEntity> getAllWmsMovementsEntity() {
        return movementsRepository.findAll();
    }

    @Override
    public void deleteDboWmsMovementsEntity(Integer id) {
        movementsRepository.deleteById(id);
    }

    @Override
    public Optional<wmsMovementsEntity> getWmsMovementsEntityById(Integer id) {
        return movementsRepository.findById(id);
    }

    @Override
    public wmsMovementsEntity updateWmsMovementsEntity(wmsMovementsEntity movementsEntity) {
        return movementsRepository.save(movementsEntity);
    }

    @Override
    public List<wmsMovementsEntity> getAllWmsMovementsEntitiesByDate(String dte) {
        return movementsRepository.findAllByDate(dte);
    }
}
