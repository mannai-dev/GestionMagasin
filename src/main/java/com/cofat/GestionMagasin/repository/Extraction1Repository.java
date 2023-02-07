package com.cofat.GestionMagasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.cofat.GestionMagasin.entities.Extraction1;
import com.cofat.GestionMagasin.entities.DboWmsProductsEntity;
import com.cofat.GestionMagasin.entities.DboWmsMovementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Extraction1Repository extends JpaRepository<Extraction1, Long> {

   @Transactional
   @Modifying
    @Query(value = "SELECT p.code, p.code AS item, CONCAT('         ' ,p.code) AS t_item, m.palletbarcode, m.id, m.palletbarcode AS num, " +
            " m.productid, M.initialquantity, m.initialquantity AS qté, m.date , " +
            "CONCAT( SUBSTRING(m.date,1,4) , SUBSTRING(m.date,6,2) , SUBSTRING(m.date,9,2)) AS num_OM , " +
            "CONCAT( SUBSTRING(m.date,1,4) , SUBSTRING(m.date,6,2) , SUBSTRING(m.date,9,2)) AS orno , " +
            "CONCAT( SUBSTRING(m.date,1,4) , SUBSTRING(m.date,6,2) , SUBSTRING(m.date,9,2)) AS t_orno , " +
            " 1 AS oset, 1 AS t_oset, m.movementtype , " +
            "CONCAT(SUBSTRING(m.date,9,2) , '/' , SUBSTRING(m.date,6,2) , '/' , SUBSTRING(m.date,1,4)) AS jour  " +
            "FROM wms_movements m LEFT JOIN wms_products p ON m.productid = p.id " +
            "WHERE ( m.movementtype='500' Or m.movementtype='601') "    +
            "AND CONCAT(SUBSTRING(m.date,9,2) , '-' , SUBSTRING(m.date,6,2) , '-' , SUBSTRING(m.date,1,4))= :dte " ,  nativeQuery = true)
     List<Extraction1> findExtraction1ByDate(String dte);


   /* @Transactional
    @Query(value = "SELECT m.palletbarcode, m.id, m.palletbarcode AS num INTO J1 " +
            "FROM wms_movements m " +
            "WHERE m.movementtype='500' ", nativeQuery = true)
             public void  findExtraction1ByDate(@Param("dte") String dte);
*/

}
