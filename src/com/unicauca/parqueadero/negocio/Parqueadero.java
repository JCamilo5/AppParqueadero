/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.google.gson.Gson;
import com.unicauca.parqueadero.acceso.ServicioServidorUnicauca;
import java.util.ArrayList;
import com.unicauca.parqueadero.acceso.IServiciosParqueadero;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author JuanCamilo
 */
public class Parqueadero extends Observable {

    Timer timer;
    int seconds;

    private IServiciosParqueadero servicioParqueadero;
    private String respuesta;

    public Parqueadero() {
        timer = new Timer();
        servicioParqueadero = new ServicioServidorUnicauca();
        respuesta = "";
    }

    class NotifyTask extends TimerTask {

        @Override
        public void run() {
            setChanged();
            notifyObservers();
        }
    }

    public void schedule(long seconds) {
        timer.scheduleAtFixedRate(new NotifyTask(), 0, seconds * 2000); //delay in milliseconds

    }

    public void stop() {
        timer.cancel();
    }

    /**
     * Meotodo que manda a registrar el ingreso de un vehiculo a una bahia
     *
     * @param cedula cedula del conductor
     * @param placa placa del vehiculo con el que entro
     * @param bahia bahia que se le asigno
     * @return true si fue exitoso false de lo contrario
     */
    public boolean registrarIngreso(String cedula, String placa, String bahia) {
        boolean exito = false;
        respuesta = servicioParqueadero.ingresarVehiculo(cedula, placa, bahia);
        if (respuesta.equals("Registro Exitoso")) {
            exito = true;
        }
        return exito;
    }

    /**
     * Metodo que devuelve un arreglo con los id de las bahias ocupadas
     *
     * @return ArrayList de bahias
     */
    public ArrayList<Bahia> obtenerOcupados() {
        String arrayJson = servicioParqueadero.obtenerOcupados();
        ArrayList<Bahia> bahias = new ArrayList<>();
        if (!arrayJson.equals("Parqueadero libre")) {

            bahias = deserelizarBahia(arrayJson);

        } else {

        }
        return bahias;
    }

    public boolean registrarSalida(String bahia) {
        boolean exito = true;
        if (servicioParqueadero.registrarSalida(bahia).equals("Error")) {
            exito = false;
        }
        return exito;
    }

    private ArrayList<Bahia> deserelizarBahia(String arrayJsonSerializado) {
        Bahia[] bahias = new Gson().fromJson(arrayJsonSerializado, Bahia[].class);
        ArrayList<Bahia> lista_bahias = new ArrayList<>();

        for (int i = 0; i < bahias.length; i++) {
            lista_bahias.add(bahias[i]);
        }
        return lista_bahias;
    }

}
