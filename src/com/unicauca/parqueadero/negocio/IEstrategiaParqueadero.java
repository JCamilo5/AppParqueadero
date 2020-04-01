/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueaderoController;

/**
 *
 * @author JuanCamilo
 */
public interface IEstrategiaParqueadero {
    public void cargarInicio(GUIParqueadero vista);
    public void procesar(String puesto,GUIParqueadero vista,GUIParqueaderoController c);
    public void cargarPuesto(GUIParqueadero vista);
    public void terminarHilo();
}
