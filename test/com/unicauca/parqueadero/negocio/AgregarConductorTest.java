/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import java.util.ArrayList;
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
public class AgregarConductorTest {

    private final GestorConductor gestor = new GestorConductor();

    public AgregarConductorTest() {

    }

    @Test
    public void agregarHomero() {
        boolean exito = true;

        boolean t1 = gestor.agregarConductor("1001", "Homero", "Simpson", "M", "1969-02-05");
        assertEquals(exito, t1);

        boolean t6 = gestor.asociarRol("1001", "1");
        assertEquals(exito, t6);

        boolean t11 = gestor.agregarVehiculo("SPGF", "Ford", "Automovil");
        assertEquals(exito, t11);

    }

    
    @Test
    public void agregarMarge() {
        boolean exito = true;

        boolean t2 = gestor.agregarConductor("1002", "Marge", "Simpson", "F", "1969-02-05");
        assertEquals(exito, t2);

        boolean t7 = gestor.asociarRol("1002", "2");
        assertEquals(exito, t7);
        
        boolean t8 = gestor.agregarVehiculo("SPGF2", "Jeep", "Automovil");
    }

    @Test
    public void agregarLisa() {
        boolean exito = true;

        boolean t3 = gestor.agregarConductor("1003", "Lisa", "Simpson", "F", "1969-02-05");
        assertEquals(exito, t3);

        boolean t8 = gestor.asociarRol("1003", "3");
        assertEquals(exito, t8);
    }

    @Test
    public void agregarBart() {
        boolean exito = true;

        boolean t5 = gestor.agregarConductor("1005", "Bart", "Simpson", "M", "1969-02-05");
        assertEquals(exito, t5);

        boolean t10 = gestor.asociarRol("1005", "5");
        assertEquals(exito, t10);
    }

  


}
