/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.negocio.Bahia;
import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueadero;
import com.unicauca.parqueadero.presentacion.GUIParqueaderoController;
import com.unicauca.parqueadero.utilidades.Utilidades;
import java.util.ArrayList;
import com.unicauca.parqueadero.negocio.IEstrategiaParqueadero;

/**
 *
 * @author JuanCamilo
 */
public class EstrategiaEntrada implements IEstrategiaParqueadero {

    Parqueadero gestor = new Parqueadero();
    Hilo t1;

    @Override
    public void procesar(String puesto, GUIParqueadero vista, GUIParqueaderoController c) {
        int op;
        int indice = Integer.parseInt(puesto);
        op = Utilidades.mensajeConfirmacion("Esta seguro que desea asignar el puesto: " + puesto, "CONFIRMACION");
        if (op == 0) {
            if (gestor.registrarIngreso(c.getCedula(), c.getPlaca(), puesto)) {
 
                vista.deshabilitar((indice - 1),true);
                Utilidades.mensajeExito("Ingreso Exitoso", "Proceso Exitoso");
            } else {
                Utilidades.mensajeError("Un error inesperado ha ocurrido", "Proceso Fallido");
                vista.habilitar((indice - 1),true);
            }
            this.terminarHilo();
            System.out.println("Termino hilo");
            vista.dispose();
        } else {
            vista.habilitar((indice - 1),true);
        }
        vista.dispose();
    }

    @Override
    public void cargarPuesto(GUIParqueadero vista) {

        ArrayList<Bahia> aux = gestor.obtenerOcupados();
        System.out.println("for");
        for (int i = 0; i < vista.getBotones().size(); i++) {
            for (int j = 0; j < aux.size(); j++) {
                if (vista.getBotones().get(i).getText().equals(aux.get(j).getIdentificador())) {

                    vista.deshabilitar(i,true);
                    break;
                } else {

                }
                if (j == aux.size() - 1) {
                    vista.habilitar(i,true);
                }

            }
        }
        try {
            if (t1.t.getName() != null) {
                //no existe
            }
        } catch (Exception e) {
            t1 = new Hilo();
                t1.setEstrategia(this);
                t1.setVista(vista);
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
    @Override
    public void terminarHilo(){
        try {
                Thread.sleep(1);
                t1.t.interrupt();
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Caught:" + e);
            }
    }
}
