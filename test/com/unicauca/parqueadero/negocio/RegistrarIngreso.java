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
public class RegistrarIngreso {

    private final Parqueadero parqueadero = new Parqueadero();

    public RegistrarIngreso() {
    }

    @Test
    public void ingreso1() {
        boolean exito = true;
        boolean t1 = parqueadero.registrarIngreso("1001", "SPGF", "1");
        assertEquals(exito, t1);
    }

    @Test
    public void ingreso2() {
        boolean exito = true;
        boolean t1 = parqueadero.registrarIngreso("1002", "SPGF2", "2");
        assertEquals(exito, t1);
    }
}
