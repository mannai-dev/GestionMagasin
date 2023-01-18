package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.DboWmsProductsEntity;
import com.cofat.GestionMagasin.repository.DboWmsProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DboWmsProductsServiceImpl implements IDboWmsProductsService {

    @Autowired
    DboWmsProductsRepository dboWmsProductsRepository;

    //private DboWmsProductsEntity dboWmsProductsEntity;

    @Override
    public void addDboWmsProducts(DboWmsProductsEntity dboWmsProductsEntity) {
        dboWmsProductsRepository.save(dboWmsProductsEntity);
    }

    @Override
    public List<DboWmsProductsEntity> getAllDboWmsProductsEntity() {
      return   dboWmsProductsRepository.findAll();
    }

    @Override
    public void deleteDboWmsProductsEntity(String id) {
       dboWmsProductsRepository.deleteDboWmsProductsEntitiesById(id);
    }

    @Transactional
    @Override
    public DboWmsProductsEntity getDboWmsProductsEntityById(String id) {
        return dboWmsProductsRepository.findDboWmsProductsEntitiesById(id);
    }

    @Override
    public DboWmsProductsEntity updateDboWmsProductsEntity(DboWmsProductsEntity dboWmsProductsEntity) {
        return dboWmsProductsRepository.save(dboWmsProductsEntity);
    }
}
