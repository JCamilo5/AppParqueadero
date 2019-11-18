/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.main;

import com.unicauca.parqueadero.negocio.GestorConductor;
import com.unicauca.parqueadero.negocio.GestorUsuarios;
import com.unicauca.parqueadero.negocio.Usuario;
import com.unicauca.parqueadero.presentacion.GUIAutenticacion;
import com.unicauca.parqueadero.presentacion.GUIAutenticacion;

import com.unicauca.parqueadero.presentacion.GUILoginController;
import com.unicauca.parqueadero.presentacion.GUILoginController;
/**
 *
 * @author Personal
 */
public class RunMVC {
    public RunMVC() {
       GUIAutenticacion vista = new GUIAutenticacion();
       GestorUsuarios modelo = new GestorUsuarios();
       
       GUILoginController controlador = new GUILoginController(vista, modelo);
       controlador.iniciar();
    }
}
