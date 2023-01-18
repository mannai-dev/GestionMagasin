package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.Ttcibd004XxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Ttcibd004XxxRepository extends JpaRepository<Ttcibd004XxxEntity, String> {

    @Transactional
   // @Modifying
    @Query("select p from Ttcibd004XxxEntity p where p.tCitt = :tCitt")
    public Ttcibd004XxxEntity findTtcibd004XxxEntityById(@Param("tCitt") String tCitt);
}