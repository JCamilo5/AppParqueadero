/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

/**
 *
 * @author JuanCamilo
 */
public interface IServiciosParqueadero {
  
    public String ingresarVehiculo(String cedula,String placa,String bahia);
    public String obtenerOcupados();
}
