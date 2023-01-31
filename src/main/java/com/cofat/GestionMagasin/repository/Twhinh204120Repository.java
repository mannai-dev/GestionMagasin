package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.Twhinh204120Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Twhinh204120Repository extends JpaRepository<Twhinh204120Entity, String> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Twhinh204120Entity p where p.tOorg = :tOorg")
    public void deleteByOorg(@Param("tOorg") String tOorg);

    @Transactional
   // @Modifying
    @Query("select p from Twhinh204120Entity p  where p.id = :id")
    public Twhinh204120Entity findTwhinh204120EntityById(@Param("id") Integer id);
}