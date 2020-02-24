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
public class GestorUsuarioTest {
    
    public GestorUsuarioTest(){
        
    }
    
    @Test
    public void consultas() {
        
        GestorUsuarios gestor = new GestorUsuarios();
        Usuario result = gestor.consultarUsuario("jcanacona", "fiet");
        
        String cedula = "147";
        String nombres ="juan camilo";
        String apellidos = "anacona salazar";
        String fechaNaci = "03/02/2019";
        String usuario = "jcanacona";
        String password = "fiet";
        System.out.println(result.getCedula().length());
        assertEquals(cedula,result.getCedula());
        assertEquals(nombres,result.getNombres());
        assertEquals(apellidos,result.getApellidos());
        assertEquals(fechaNaci,result.getFechaNaci());
        assertEquals(usuario,result.getUser());
        assertEquals(password,result.getPassword());
        
    }
}
