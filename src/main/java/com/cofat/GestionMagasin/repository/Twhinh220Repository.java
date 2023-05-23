package com.cofat.GestionMagasin.repository;

//import com.cofat.GestionMagasin.entities.Twhinh200120;
import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import com.cofat.GestionMagasin.entities.Twhinh220120;
import com.cofat.GestionMagasin.entities.Twhinh220120Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@EnableJpaRepositories
@Repository
public interface Twhinh220Repository extends JpaRepository<Twhinh220120, Twhinh220120Id> {

   // @Transactional
    @Query(value = "SELECT * FROM twhinh220 WHERE ((t_orno = :orno) AND (t_pono = :pono))", nativeQuery = true)
    Twhinh220120 findByTOrnoAndTPono(String orno , Integer pono );



    @Query(value ="SELECT TOP 1 * FROM twhinh220 WHERE t_orno = :tOrno ORDER BY t_pono DESC",  nativeQuery = true)
    Twhinh220120 getLastTwhinh220120(String tOrno);

}
