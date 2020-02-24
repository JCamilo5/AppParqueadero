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
public class GestorConductorTest {
    public GestorConductorTest(){
        
    }
   
     @Test
     public void consultas() {
         GestorConductor gestor = new GestorConductor();
         Conductor resul = gestor.consultarConductor("11");
         System.out.println(resul.getNombres().length());
         String nombre ="valentino                                         ";
         String apellidos = "rossi                                             ";
         String placa = "R1M-46                                            ";
         System.out.println(placa.length());
         //Vehiculo v = gestor.obtenerVehiculosCon("11").get(0);
         assertEquals(nombre,resul.getNombres());
         assertEquals(apellidos,resul.getApellidos());
        //assertEquals(placa,v.getPlaca());
         
     
     }
}
