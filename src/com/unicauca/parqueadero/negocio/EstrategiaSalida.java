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
public class EstrategiaSalida implements EstrategiaParqueadero {

    Parqueadero gestor = new Parqueadero();

    @Override
    public void procesar(String puesto, GUIParqueadero vista, GUIParqueaderoController c) {
        int op;
        int indice = Integer.parseInt(puesto);
        op = Utilidades.mensajeConfirmacion("Esta seguro que desea liberar el puesto: " + puesto, "CONFIRMACION");
        if (op == 0) {
            if (gestor.registrarSalida(puesto)) {
                vista.deshabilitar(indice - 1);
                Utilidades.mensajeExito("Liberacion Exitosa", "Proceso Exitoso");
            } else {
                Utilidades.mensajeError("Un error inesperado ha ocurrido", "Proceso Fallido");
            }

        } else {
            vista.habilitar(indice - 1);
        }
    }

    @Override
    public void cargarPuesto(GUIParqueadero vista) {

        ArrayList<Bahia> aux = gestor.obtenerOcupados();

        for (int i = 0; i < vista.getBotones().size(); i++) {
            for (int j = 0; j < aux.size(); j++) {
                if (vista.getBotones().get(i).getText().equals(aux.get(j).getIdentificador())) {
                    vista.habilitar(i);
                    break;
                } else {

                }
                if (j == aux.size() - 1) {
                    vista.deshabilitar(i);
                }

            }
        }
    }

    @Override
    public void cargarInicio(GUIParqueadero vista) {
        
    }

}
