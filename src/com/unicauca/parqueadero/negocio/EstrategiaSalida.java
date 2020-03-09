/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.negocio.EstrategiaParqueadero;
import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueaderoController;
import com.unicauca.parqueadero.utilidades.Utilidades;
import java.util.ArrayList;

/**
 *
 * @author JuanCamilo
 */
public class EstrategiaSalida implements EstrategiaParqueadero{

    @Override
    public void procesar(String puesto, Parqueadero gestor, GUIParqueadero vista, GUIParqueaderoController c) {
        int op;
        int indice = Integer.parseInt(puesto);
        op = Utilidades.mensajeConfirmacion("Esta seguro que desea liberar el puesto: "+puesto, "CONFIRMACION");
        if(op == 0){
            if(gestor.registrarSalida(puesto)){
                vista.cambiarColorSalida(indice-1);
                Utilidades.mensajeExito("Liberacion Exitosa", "Proceso Exitoso");
            }else{
                Utilidades.mensajeError("Un error inesperado ha ocurrido", "Proceso Fallido");
            }
            
        }else{
            vista.habilitar(indice - 1);
        }
    }

    @Override
    public void cargarPuesto(Parqueadero gestor, GUIParqueadero vista, GUIParqueaderoController c) {
        c.esta_habilitada(vista);
        
         ArrayList<Bahia> aux = gestor.obtenerOcupados();
        for (int i = 0; i < aux.size(); i++) {
            for (int j = 0; j < vista.getBotones().size(); j++) {
                if (vista.getBotones().get(j).getText().equals(aux.get(i).getIdentificador())) {
                    vista.cambiarColor(j);
                }
            }   
        }
        
         for (int i = 0; i < aux.size(); i++) {
            for (int j = 0; j < vista.getBotones().size(); j++) {
                if (vista.getBotones().get(j).getText().equals(aux.get(i).getIdentificador())) {
                    vista.habilitarSalida(j);
                }
            }   
        }
        
        
    }

    
}
