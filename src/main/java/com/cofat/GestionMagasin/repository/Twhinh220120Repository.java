package com.cofat.GestionMagasin.repository;


import com.cofat.GestionMagasin.entities.Twhinh220120Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Twhinh220120Repository extends JpaRepository<Twhinh220120Entity, String> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Twhinh220120Entity p where p.oorg = :oorg")
    public void deleteByOorg(@Param("oorg") String oorg);
    @Transactional
    //@Modifying
    @Query("select p from Twhinh220120Entity p  where p.id = :id")
    public Twhinh220120Entity findById(@Param("id") int id);
}