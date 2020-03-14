/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.negocio.EstrategiaParqueadero;
import com.unicauca.parqueadero.negocio.Bahia;
import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueaderoController;
import com.unicauca.parqueadero.utilidades.Utilidades;
import java.util.ArrayList;

/**
 *
 * @author JuanCamilo
 */
public class EstrategiaEntrada implements EstrategiaParqueadero {

    Parqueadero gestor = new Parqueadero();

    @Override
    public void procesar(String puesto, GUIParqueadero vista, GUIParqueaderoController c) {
        int op;
        int indice = Integer.parseInt(puesto);
        op = Utilidades.mensajeConfirmacion("Esta seguro que desea asignar el puesto: " + puesto, "CONFIRMACION");
        if (op == 0) {
            if (gestor.registrarIngreso(c.getCedula(), c.getPlaca(), puesto)) {
                vista.deshabilitar(indice - 1);
                Utilidades.mensajeExito("Ingreso Exitoso", "Proceso Exitoso");
            } else {
                Utilidades.mensajeError("Un error inesperado ha ocurrido", "Proceso Fallido");
                vista.habilitar(indice - 1);
            }
            vista.dispose();
        } else {
            vista.habilitar(indice - 1);
        }
        vista.dispose();
    }

    @Override
    public void cargarPuesto(GUIParqueadero vista) {

        ArrayList<Bahia> aux = gestor.obtenerOcupados();

        for (int i = 0; i < vista.getBotones().size(); i++) {
            for (int j = 0; j < aux.size(); j++) {
                if (vista.getBotones().get(i).getText().equals(aux.get(j).getIdentificador())) {
                    vista.deshabilitar(i);
                    break;
                } else {

                }
                if (j == aux.size() - 1) {
                    vista.habilitar(i);
                }

            }
        }
        /*for (int i = 0; i < aux.size(); i++) {
            for (int j = 0; j < vista.getBotones().size(); j++) {
                if (vista.getBotones().get(j).getText().equals(aux.get(i).getIdentificador())) {
                    vista.deshabilitar(j);
                }
            }
            
        }*/
    }

    @Override
    public void cargarInicio(GUIParqueadero vista) {

    }

}
