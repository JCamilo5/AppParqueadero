/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanCamilo
 */
public class AgregarVigilanteTest {

    private final GestorVigilante gestor = new GestorVigilante();

    public AgregarVigilanteTest() {
    }

    @Test
    public void agregarVig1() {
        boolean exito = true;
        boolean t1 = gestor.agregarVigilante("4141", "SecS", "v1", "vigilante", "vig", "M", "1999-01-05", "123", "Salida_Norte");
        assertEquals(exito, t1);
    }

    @Test
    public void agregarVig2() {
        boolean exito = true;
        boolean t1 = gestor.agregarVigilante("4142", "SecS", "v1", "vigilante", "vig1", "M", "1999-01-05", "123", "Salida_Norte");
        assertEquals(exito, t1);
    }

    @Test
    public void agregarVig3() {
        boolean exito = true;
        boolean t1 = gestor.agregarVigilante("4143", "SecS", "v1", "vigilante", "vig2", "M", "1999-01-05", "123", "Salida_Norte");
        assertEquals(exito, t1);
    }

}
