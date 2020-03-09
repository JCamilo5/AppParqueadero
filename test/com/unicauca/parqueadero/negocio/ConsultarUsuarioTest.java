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
public class ConsultarUsuarioTest {
    private final GestorUsuarios gestor = new GestorUsuarios();
    public ConsultarUsuarioTest(){
        
    }
    
    @Test
    public void consultaUsuario1() {     
        Usuario result = gestor.consultarUsuario("jcanacona", "123");
        assertEquals("Juan Camilo",result.getNombres());
        assertEquals("Anacona Salazar",result.getApellidos());
        assertEquals("10001",result.getCedula());
        assertEquals("administrador", result.getPrivilegio());
    }
     @Test
    public void consultaUsuario2() {     
        Usuario result = gestor.consultarUsuario("luipelaez", "123");
        assertEquals("Luisa Fernanda",result.getNombres());
        assertEquals("Pelaez Perafan",result.getApellidos());
        assertEquals("9800008",result.getCedula());
        assertEquals("administrador", result.getPrivilegio());
    }
     @Test
    public void consultaUsuario3() {     
        Usuario result = gestor.consultarUsuario("crissolis", "123");
        assertEquals("Juan Esteban",result.getNombres());
        assertEquals("Solis Melano",result.getApellidos());
        assertEquals("9800002",result.getCedula());
        assertEquals("administrador", result.getPrivilegio());
    }
    @Test
    public void consultaUsuario4() {     
        Usuario result = gestor.consultarUsuario("sofpaz", "123");
        assertEquals("Sofia Camila",result.getNombres());
        assertEquals("Paz Gutierrez",result.getApellidos());
        assertEquals("9800005",result.getCedula());
        assertEquals("vigilante", result.getPrivilegio());
    }
    @Test
    public void consultaUsuario5() {     
        Usuario result = gestor.consultarUsuario("cristobar", "123");
        assertEquals("Cristian Camilo",result.getNombres());
        assertEquals("Tobar Fernandez",result.getApellidos());
        assertEquals("9800001",result.getCedula());
        assertEquals("vigilante", result.getPrivilegio());
    }
    @Test
    public void consultaUsuario6() {     
        Usuario result = gestor.consultarUsuario("campacheco", "123");
        assertEquals("Camilo Andres",result.getNombres());
        assertEquals("Pacheco Ortiz",result.getApellidos());
        assertEquals("9800003",result.getCedula());
        assertEquals("vigilante", result.getPrivilegio());
    }
}
