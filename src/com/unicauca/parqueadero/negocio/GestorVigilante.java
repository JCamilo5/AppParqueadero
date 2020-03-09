/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;
import com.unicauca.parqueadero.acceso.IServiciosVigilantes;
import com.unicauca.parqueadero.acceso.ServicioServidorUnicauca;
/**
 *
 * @author JuanCamilo
 */
public class GestorVigilante {
    private IServiciosVigilantes servicioVigilantes;
    private String respuesta;
    
    public GestorVigilante(){
        servicioVigilantes = new ServicioServidorUnicauca();
        respuesta = "";
    }
    public boolean agregarVigilante(String ced, String emp, String usua, String noms, String apells, String genero, String fechaNaci, String contra, String puesto){
        boolean exito =false;
        respuesta = servicioVigilantes.agregarVigilante(ced, emp, usua, noms, apells, genero, fechaNaci, contra, puesto);
        if(!respuesta.equals("Error")){
            exito = true;
        }
        return exito;
    }
}
