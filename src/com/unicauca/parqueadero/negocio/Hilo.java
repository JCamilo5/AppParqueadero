/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.presentacion.GUIParqueadero;
import com.unicauca.parqueadero.negocio.IEstrategiaParqueadero;

/**
 *
 * @author Personal
 */
public class Hilo implements Runnable {

    public Thread t;
    private IEstrategiaParqueadero estrategia;
    private GUIParqueadero vista;

    public Hilo() {
        t = new Thread(this);
        System.out.println("New thread: " + t);
        t.start(); // Starting the thread 
    }
    public void setEstrategia(IEstrategiaParqueadero est) {
        this.estrategia = est;
    }
    public void setVista(GUIParqueadero vista){
        this.vista=vista;
    }
    // execution of thread starts from run() method 
    public void run() {
        int segundos = 0;
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(1000);
                segundos++;
                if (segundos >= 3) {
                    System.out.println("Cargar mapa");
                    estrategia.cargarPuesto(vista);
                    segundos = 0;
                }
            }
            System.out.println("Por fuera del while");
        } catch (Exception e) {
        }
    }
}