package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.wmsMovementsEntity;
import com.cofat.GestionMagasin.entities.wmsProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface wmsProductsRepository  extends JpaRepository<wmsProductsEntity, Integer> {
    /*
    @Query("select p from wmsProductsEntity p where p.code = :Code")
    public List<wmsMovementsEntity> findAllByIdDate(@Param("Code") String Code);

    @Query("select p from DboWmsProductsEntity p where p.id = :id")
    public DboWmsProductsEntity findDboWmsProductsEntitiesById(@Param("id") String id);
*/
}
