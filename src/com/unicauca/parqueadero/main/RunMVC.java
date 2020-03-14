/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.main;


import com.unicauca.parqueadero.negocio.GestorConductor;
import com.unicauca.parqueadero.negocio.GestorUsuarios;
import com.unicauca.parqueadero.negocio.GestorVigilante;
import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.negocio.EstrategiaEntrada;
import com.unicauca.parqueadero.negocio.EstrategiaFactory;
import com.unicauca.parqueadero.negocio.EstrategiaParqueadero;
import com.unicauca.parqueadero.negocio.EstrategiaSalida;
import com.unicauca.parqueadero.presentacion.GUIAutenticacion;
import com.unicauca.parqueadero.presentacion.GUIBusquedaConductor;
import com.unicauca.parqueadero.presentacion.GUILoginController;
import com.unicauca.parqueadero.presentacion.GUIMenu;
import com.unicauca.parqueadero.presentacion.GUIParqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueaderoController;
import com.unicauca.parqueadero.presentacion.GUIRegistroConductor;
import com.unicauca.parqueadero.presentacion.GUIRegistroVehiculo;
import com.unicauca.parqueadero.presentacion.GUIRegistroVigilante;

/**
 *
 * @author Personal
 */
public class RunMVC {
   
    
    public RunMVC() {
        //Factory
        EstrategiaFactory factory = new EstrategiaFactory();
        
        
        //Vista Registro vigilante y modelo
        GestorVigilante modeloVig = new GestorVigilante();
        GUIRegistroVigilante vistaRegistrVig = new GUIRegistroVigilante();
        vistaRegistrVig.cargarDtp();
        vistaRegistrVig.setModelo(modeloVig);
        //Modelo Registro vehiculo
        GestorConductor modelCV = new GestorConductor();
        //Vista Registro Vehiculo
        GUIRegistroVehiculo vistaRegistroV = new GUIRegistroVehiculo();
        vistaRegistroV.setModelo(modelCV);
        //Vista,Modelo y Controlador del parqueadero
        GUIParqueadero vistaP = new GUIParqueadero();
        Parqueadero modeloP = new Parqueadero();
        

        GUIParqueaderoController pController = new GUIParqueaderoController(vistaP,modeloP,factory);
 
        
        
        //Registro de conductor  y modelo
         GestorConductor modeloC = new  GestorConductor();
         
        GUIRegistroConductor vistaRegistroC = new GUIRegistroConductor();
        vistaRegistroC.cargarDTP();//Cargo el date time picker
        
        vistaRegistroC.setRegistroVe(vistaRegistroV);
        vistaRegistroC.setModelo(modeloC);
        //Vista de consulta
       
        
        GUIBusquedaConductor vista_busqueda = new GUIBusquedaConductor();
        
        vista_busqueda.setPController(pController);
        vista_busqueda.setModelo(modeloC);
        vista_busqueda.setRegistroCon(vistaRegistroC);
        vista_busqueda.setRegVehiculo(vistaRegistroV);
        
        modeloC.addObserver(vista_busqueda);
        modelCV.addObserver(vista_busqueda);
        //Menu
        GUIMenu menu = new GUIMenu();
        menu.setBusqueda(vista_busqueda);
        menu.setVistaMapa(pController);
        menu.setVistaRegVig(vistaRegistrVig);
        //Vista,Modelo y Controller de la autenticacion
        GUIAutenticacion vistaA = new GUIAutenticacion();
        GestorUsuarios modeloA = new GestorUsuarios();

        GUILoginController controladorA = new GUILoginController(vistaA, modeloA,menu);
        controladorA.iniciar();
        
        

        

    }
   
}
