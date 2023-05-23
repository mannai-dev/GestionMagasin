package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.DboWmsProductsEntity;
import com.cofat.GestionMagasin.entities.wmsProductsEntity;
import com.cofat.GestionMagasin.repository.DboWmsProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Basic;
import javax.persistence.Column;
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
/*
    public wmsProductsEntity createProduct(wmsProductsEntity wmsProduct) {
        wmsProduct.setId();
        String internalCode;
        String code;
        String name;
        Integer wmsCategoryId;
        Integer wmsSubCategoryId;
        String wmsProviderCode;
        String providerProductCode;
        String customerProductCode;
        String label2;
        String colorCode;
        Integer costPrice;
        String lastInventoryDate;
        Boolean  active;
        Integer securityStock;
        Integer multipleQuantity;
        String unit;
        String qualityCode;
        String createdOnUtc;
        String createdBy;
        String updatedOnUtc;
        String updatedBy;

        return wmsProduct;
    }
*/
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
