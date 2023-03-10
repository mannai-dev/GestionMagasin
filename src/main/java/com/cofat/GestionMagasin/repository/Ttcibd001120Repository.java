package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.Ttcibd001120Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Ttcibd001120Repository extends JpaRepository<Ttcibd001120Entity, String> {
    @Transactional
  //  @Modifying
    @Query("select p from Ttcibd001120Entity p where p.tItem = :tItem")
    public Ttcibd001120Entity findTtcibd001120EntitiesById(@Param("tItem") String tItem);
}