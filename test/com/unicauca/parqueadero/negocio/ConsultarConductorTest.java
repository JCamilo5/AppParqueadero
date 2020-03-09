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
public class ConsultarConductorTest {

    private final GestorConductor gestor = new GestorConductor();

    public ConsultarConductorTest() {

    }

    @Test
    public void consultaHomero() {

        Conductor resultado = gestor.consultarConductor("1001");
        assertEquals("Homero", resultado.getNombres());
        assertEquals("Simpson", resultado.getApellidos());
        assertEquals("M", resultado.getGenero());
        assertEquals("Estudiante", resultado.getRol());
        ArrayList<Vehiculo> v = new ArrayList<>();

        v = gestor.obtenerVehiculosCon("1001");
        assertEquals("SPGF", v.get(0).getPlaca());

    }

    @Test
    public void consultarMarge() {
        Conductor resultado = gestor.consultarConductor("1002");
        assertEquals("Marge", resultado.getNombres());
        assertEquals("Simpson", resultado.getApellidos());
        assertEquals("F", resultado.getGenero());
        assertEquals("Docente", resultado.getRol());
    }

    @Test
    public void consultarBart() {
        Conductor resultado = gestor.consultarConductor("1005");

        assertEquals("Bart", resultado.getNombres());
        assertEquals("Simpson", resultado.getApellidos());
        assertEquals("M", resultado.getGenero());
        assertEquals("Visitante", resultado.getRol());
    }

    @Test
    public void consultarLisa() {
        Conductor resultado = gestor.consultarConductor("1003");

        assertEquals("Lisa", resultado.getNombres());
        assertEquals("Simpson", resultado.getApellidos());
        assertEquals("F", resultado.getGenero());
        assertEquals("Administrativo", resultado.getRol());
    }
}
