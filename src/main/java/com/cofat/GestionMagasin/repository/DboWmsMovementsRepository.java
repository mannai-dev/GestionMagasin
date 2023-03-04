package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.DboWmsMovementsEntity;
import com.cofat.GestionMagasin.entities.Extraction1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
            " dbo_Wms_Movements.Date AS jour " +
            "FROM dbo_Wms_Movements LEFT JOIN dbo_Wms_Products ON dbo_Wms_Movements.ProductId = dbo_Wms_Products.Id" +
            "WHERE (dbo_Wms_Movements.MovementType=500 Or dbo_Wms_Movements.MovementType=601)")
    public Extraction ExtractionMovements();*/

    @Transactional
    @Modifying
    @Query(value =
            //   " SET IDENTITY_INSERT extraction1 ON;" +
            //  " INSERT INTO extraction1  " +
            // " ( code, item, t_item,palletbarcode,id,num,productid,initialquantity,qté," +
            //" extraction1.date ,num_OM,orno,t_orno,oset,t_oset,movementtype,jour) " +
            "SELECT TOP 10 m.id AS id , p.code AS code, m.date  ,m.initialquantity AS initialquantity ,p.code AS item," +
                    "CONCAT(SUBSTRING(m.date,9,2) , '/' , SUBSTRING(m.date,6,2) , '/' , SUBSTRING(m.date,1,4)) AS jour , " +
                    " m.movementtype AS movementtype ,m.palletbarcode AS num, " +
                    "CONCAT( SUBSTRING(m.date,1,4) , SUBSTRING(m.date,6,2) , SUBSTRING(m.date,9,2)) AS num_OM , " +
                    "CONCAT( SUBSTRING(m.date,1,4) , SUBSTRING(m.date,6,2) , SUBSTRING(m.date,9,2)) AS orno , " +
                    "1 AS oset,m.palletbarcode AS palletbarcode,m.productid AS productid , m.initialquantity AS qté,"+
                    " CONCAT('         ' ,p.code) AS t_item,   " +
                    "CONCAT( SUBSTRING(m.date,1,4) , SUBSTRING(m.date,6,2) , SUBSTRING(m.date,9,2)) AS t_orno ," +
                    " 1 AS t_oset INTO j1 " +
                    //"INTO extraction1 " +
                    "FROM wms_movements m LEFT JOIN wms_products p ON m.productid = p.id " +
                    "WHERE ( m.movementtype='500' Or m.movementtype='601') "    +
                    "AND CONCAT(SUBSTRING(m.date,9,2) , '-' , SUBSTRING(m.date,6,2) , '-' , SUBSTRING(m.date,1,4))= :dte ;"
            // "SET IDENTITY_INSERT extraction1 OFF; "
            ,  nativeQuery = true)
            List<?> findExtraction1ByDate(String dte);


}

/*

 */