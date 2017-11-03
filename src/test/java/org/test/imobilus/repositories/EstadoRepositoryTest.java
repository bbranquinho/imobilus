package org.test.imobilus.repositories;

import org.apache.log4j.Logger;
import org.imobilus.Estados.EstadosEntity;
import org.imobilus.Estados.EstadosRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.test.imobilus.utils.BaseTest;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EstadoRepositoryTest extends BaseTest {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    @Autowired
    private EstadosRepository estadosRepository;

    @Test
    public void insert(){
        EstadosEntity estado = new EstadosEntity();
        estado.setNomeEstado("Minas Gerais");
        estado.setSiglaEstado("MG");
        estadosRepository.save(estado);
    }

    @Test
    public void findAllTest(){
        List<EstadosEntity> estados = this.estadosRepository.findAll();

        if (LOGGER.isInfoEnabled()){
            LOGGER.info("Test FindAll(): " + estados);
        }

        LOGGER.debug(estados);

        assertNotNull(estados);
        assertTrue(estados.size() > 0);

    }

}
