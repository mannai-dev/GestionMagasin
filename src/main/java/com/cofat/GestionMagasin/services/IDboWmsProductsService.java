package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.DboWmsProductsEntity;
import com.cofat.GestionMagasin.entities.wmsProductsEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public interface IDboWmsProductsService {
    void addDboWmsProducts (DboWmsProductsEntity dboWmsProductsEntity);

    List<DboWmsProductsEntity> getAllDboWmsProductsEntity();

    void deleteDboWmsProductsEntity(String id);

    @Transactional
    DboWmsProductsEntity getDboWmsProductsEntityById(String id);

    DboWmsProductsEntity updateDboWmsProductsEntity(DboWmsProductsEntity dboWmsProductsEntity);

    }
