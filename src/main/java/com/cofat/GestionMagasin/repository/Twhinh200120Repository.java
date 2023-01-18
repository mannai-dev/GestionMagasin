package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Twhinh200120Repository extends JpaRepository<Twhinh200120Entity, String> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Twhinh200120Entity p where p.tOorg = :tOorg")
    public void deleteByTOorg(@Param("tOorg") String tOorg);
    @Transactional
   // @Modifying
    @Query("SELECT p FROM Twhinh200120Entity p WHERE p.id = :id")
    Twhinh200120Entity findById(Integer id);
    @Transactional
    // @Modifying
    @Query("SELECT p FROM Twhinh200120Entity p WHERE p.tOrno = :tOrno")
    Twhinh200120Entity findByTOrno(String tOrno);
}