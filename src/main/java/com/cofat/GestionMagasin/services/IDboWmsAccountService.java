package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.DboWmsAccountEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IDboWmsAccountService {


    void addDboWmsAccount (DboWmsAccountEntity dboWmsAccountEntity);

    List<DboWmsAccountEntity> getAllDboWmsAccountEntity();

    void deleteDboWmsAccountEntity(Integer id);

    Optional<DboWmsAccountEntity> getDboWmsAccountEntityById(Integer id);

    DboWmsAccountEntity updateDboWmsAccountEntity(DboWmsAccountEntity dboWmsAccountEntity);

}
