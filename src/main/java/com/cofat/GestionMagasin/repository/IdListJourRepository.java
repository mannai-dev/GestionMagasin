package com.cofat.GestionMagasin.repository;

import com.cofat.GestionMagasin.entities.IdListJour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

//@EnableJpaRepositories
@Repository
public interface IdListJourRepository extends JpaRepository<IdListJour, Integer> {
    /* Additional custom query methods can be defined here if needed
    @Query(value ="SELECT * FROM IdListJour", nativeQuery = true)
    List<IdListJour> getAll();*/
    }
