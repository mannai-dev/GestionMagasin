package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.DboWmsProductsEntity;
import com.cofat.GestionMagasin.entities.wmsProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DboWmsProductsRepository extends JpaRepository<DboWmsProductsEntity, String> {
    @Transactional
    @Modifying
    @Query("DELETE FROM DboWmsProductsEntity p where p.id = :id")
    public void deleteDboWmsProductsEntitiesById(@Param("id") String id);
    @Transactional
    //@Modifying
    @Query("select p from DboWmsProductsEntity p where p.id = :id")
    public DboWmsProductsEntity findDboWmsProductsEntitiesById(@Param("id") String id);

    //la nouvelle entité
    @Transactional
    @Query("select p from wmsProductsEntity p where p.id = :id")
    public wmsProductsEntity findWmsProductsEntitiesById(@Param("id") Integer id);
    @Transactional
    @Modifying
    @Query("DELETE FROM wmsProductsEntity p where p.id = :id")
    public void deleteWmsProductsEntitiesById(@Param("id") Integer id);

}