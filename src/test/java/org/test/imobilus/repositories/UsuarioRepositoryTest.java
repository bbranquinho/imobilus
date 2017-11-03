package org.test.imobilus.repositories;

import org.apache.log4j.Logger;
import org.imobilus.Estados.EstadosEntity;
import org.imobilus.Estados.EstadosRepository;
import org.imobilus.Usuario.UsuarioRepository;
import org.imobilus.Usuario.UsuariosEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.test.imobilus.utils.BaseTest;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class UsuarioRepositoryTest extends BaseTest {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Test
    public void findAllTest(){
        List<UsuariosEntity> users = this.usuarioRepository.findAll();

        if (LOGGER.isInfoEnabled()){
            LOGGER.info("Test FindAll(): " + users);
        }

        LOGGER.debug(users);

        assertNotNull(users);
        assertTrue(users.size() > 0);

    }

    @Test
    public void insert(){

    }


}
