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
public interface IServiciosConductores {
    public String consultarConductor(String cedula);
    public String consultarTodosConductores();
    public String consultarVehiculoCon(String cedula);
    public String consultarRoles(String cedula);
    
    public String agregarConductor(String cedula,String nombres,String apellidos,String genero,String fechaNaci);
    public String agregarVehiculo(String placa,String marca,String tipo);
    public String asociarVehiCond(String cedula,String placa);
    public String asociarRol(String cedula,String rol);
}

