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
public class AsociarVehiculoTest {

    private final GestorConductor gestor = new GestorConductor();

    public AsociarVehiculoTest() {
    }

    @Test
    public void asociarHomer() {
        boolean exito = true;

        boolean t12 = gestor.asociarVehiCond("1001", "SPGF");
        assertEquals(exito, t12);
    }
     @Test
    public void asociarMarge() {
        boolean exito = true;

        boolean t12 = gestor.asociarVehiCond("1002", "SPGF2");
        assertEquals(exito, t12);
    }

}
