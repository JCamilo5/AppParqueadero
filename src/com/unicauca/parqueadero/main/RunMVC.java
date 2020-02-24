/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.main;


import com.unicauca.parqueadero.negocio.GestorConductor;
import com.unicauca.parqueadero.negocio.GestorUsuarios;
import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.presentacion.GUIAutenticacion;
import com.unicauca.parqueadero.presentacion.GUIBusquedaConductor;
import com.unicauca.parqueadero.presentacion.GUILoginController;
import com.unicauca.parqueadero.presentacion.GUIMenu;
import com.unicauca.parqueadero.presentacion.GUIParqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueaderoController;
import com.unicauca.parqueadero.presentacion.GUIRegistroConductor;
import com.unicauca.parqueadero.presentacion.GUIRegistroVehiculo;

/**
 *
 * @author Personal
 */
public class RunMVC {

    public RunMVC() {
        //Vista Registro Vehiculo
        GUIRegistroVehiculo vistaRegistroV = new GUIRegistroVehiculo();
        
        //Vista,Modelo y Controlador del parqueadero
        GUIParqueadero vistaP = new GUIParqueadero();
        Parqueadero modeloP = new Parqueadero();
        GUIParqueaderoController pController = new GUIParqueaderoController(vistaP,modeloP);
        //Vista de consulta y modelo
        GUIRegistroConductor vistaRegistroC = new GUIRegistroConductor();
        
        
        GestorConductor modeloC = new  GestorConductor();
        GUIBusquedaConductor vista_busqueda = new GUIBusquedaConductor();
        vista_busqueda.setPController(pController);
        vista_busqueda.setModelo(modeloC);
        vista_busqueda.setRegistroCon(vistaRegistroC);
        //Menu
        GUIMenu menu = new GUIMenu();
        menu.setBusqueda(vista_busqueda);
        menu.setVistaMapa(pController);
        //Vista,Modelo y Controller de la autenticacion
        GUIAutenticacion vistaA = new GUIAutenticacion();
        GestorUsuarios modeloA = new GestorUsuarios();

        GUILoginController controladorA = new GUILoginController(vistaA, modeloA,menu);
        controladorA.iniciar();
        

        

    }
}
