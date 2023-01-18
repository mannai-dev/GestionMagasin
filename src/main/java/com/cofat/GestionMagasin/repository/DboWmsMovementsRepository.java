package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.DboWmsMovementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DboWmsMovementsRepository extends JpaRepository<DboWmsMovementsEntity, String> {
    @Transactional
    @Modifying
    @Query("DELETE FROM DboWmsMovementsEntity d where d.id = :id")
    public void deleteDboWmsMovementsEntitiesById(@Param("id") String id);

    @Transactional
    //  @Modifying
    @Query("select d from DboWmsMovementsEntity d where d.id = :id")
    public DboWmsMovementsEntity findDboWmsMovementsEntitiesById(@Param("id") String id);
/*
    @Transactional
   // @Modifying
    @Query("SELECT dbo_Wms_Products.Code, dbo_Wms_Products.Code AS item ," +
            " dbo_Wms_Products.Code AS t_item, dbo_Wms_Movements.PalletBarcode ," +
            "dbo_Wms_Movements.Id, dbo_Wms_Movements.PalletBarcode AS num ," +
            "dbo_Wms_Movements.ProductId, dbo_Wms_Movements.InitialQuantity ," +
            "dbo_Wms_Movements.InitialQuantity AS qté, dbo_Wms_Movements.Date ," +
            " dbo_Wms_Movements.Date AS NumOM," +
            " dbo_Wms_Movements.Date AS orno," +
            " dbo_Wms_Movements.Date AS t_orno," +
            " 1 AS oset, 1 AS t_oset, dbo_Wms_Movements.MovementType," +
            " dbo_Wms_Movements.Date AS jour" +
            "FROM dbo_Wms_Movements LEFT JOIN dbo_Wms_Products ON dbo_Wms_Movements.ProductId = dbo_Wms_Products.Id" +
            "WHERE (dbo_Wms_Movements.MovementType=500 Or dbo_Wms_Movements.MovementType=601)")
    public Extraction ExtractionMovements();*/


}

/*

 */