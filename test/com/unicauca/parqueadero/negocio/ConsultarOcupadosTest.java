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
public class ConsultarOcupadosTest {
    private final Parqueadero parqueadero = new Parqueadero();
    
    public ConsultarOcupadosTest() {
    }
    @Test
    public void consultarOcupados(){
        ArrayList<Bahia> bahias;
        bahias = parqueadero.obtenerOcupados();
        assertEquals(bahias.size(), 2);
    }
   @Test
   public void consultarId(){
       ArrayList<Bahia> bahias;
       bahias = parqueadero.obtenerOcupados();
       assertEquals(bahias.get(0).getIdentificador(), "1");
       assertEquals(bahias.get(1).getIdentificador(), "2");
   }
    
}
