/*package com.cofat.GestionMagasin.test;
import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import com.cofat.GestionMagasin.repository.Twhinh220Repository;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class Twhinh220Test {

    @Autowired
    private Twhinh220Repository repository;

    @Test
    public void testFindByTOrnoAndTPono() {
        Twhinh200120Entity entity = new Twhinh200120Entity();
        entity.settOrno("51");
        entity.setTp(1);
        repository.save(entity);

        Twhinh200120Entity foundEntity = repository.findByTOrnoAndTPono("12345", 1);
        assertEquals(entity, foundEntity);
    }

    @Test
    public void testGetLastTwhinh220() {
        Twhinh200120Entity entity1 = new Twhinh200120Entity();
        entity1.setOrno("12345");
        entity1.setPono(1);
        repository.save(entity1);

        Twhinh200120Entity entity2 = new Twhinh200120Entity();
        entity2.setOrno("12345");
        entity2.setPono(2);
        repository.save(entity2);

        Twhinh200120Entity foundEntity = repository.getLastTwhinh220("12345");
        assertEquals(entity2, foundEntity);
    }
}*/
