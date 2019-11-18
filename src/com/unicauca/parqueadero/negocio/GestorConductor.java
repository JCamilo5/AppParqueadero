/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.IServiciosConductores;
import com.unicauca.parqueadero.acceso.ServicioServidorUnicauca;
import java.util.ArrayList;
import java.lang.String;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.util.Properties;
import mvcf.AModel;

/**
 *
 * @author JuanCamilo
 */
public class GestorConductor extends AModel {

    private IServiciosConductores servicioConductores;
    private Conductor conductor;
    private ArrayList<Conductor> listaConductores;
    private ArrayList<Vehiculo> listaVehiculos;
    private String respuesta;

    public GestorConductor() {
        servicioConductores = new ServicioServidorUnicauca();
        conductor = null;
        listaVehiculos = null;
        listaConductores = null;
        respuesta = "";
    }

    public IServiciosConductores getServicioConductores() {
        return servicioConductores;
    }

    public void setServicioConductores(IServiciosConductores servicioConductores) {
        this.servicioConductores = servicioConductores;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public ArrayList<Conductor> getListaConductores() {
        return listaConductores;
    }

    public void setListaConductores(ArrayList<Conductor> listaConductores) {
        this.listaConductores = listaConductores;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String consultarRoles(String cedula) {
        String rol = servicioConductores.consultarRoles(cedula);
        return rol;
    }

    public Conductor consultarConductor(String cedula) {
        Conductor miConductor = null;
        String json = servicioConductores.consultarConductor(cedula);
        if (!json.equals("No se encontro a ningun conductor con esa cedula")) {
            miConductor = parseToConductor(json);
        } else {
            respuesta = json;
        }
        return miConductor;
    }

    public ArrayList<Vehiculo> obtenerVehiculosCon(String cedula) {
        String arrayJson = servicioConductores.consultarVehiculoCon(cedula);
        ArrayList<Vehiculo> lista_vehiculos = new ArrayList<>();

        if (!arrayJson.equals("El conductor no tiene asociado ningun vehiculo")) {

            lista_vehiculos = deserializarVehiculos(arrayJson);
            listaVehiculos = lista_vehiculos;

        } else {
            respuesta = arrayJson;
        }
        return lista_vehiculos;
    }
    
    private ArrayList<String> deserializarRoles(String arrayJsonSerializado){
        System.out.println(arrayJsonSerializado);
        return null;
    }

    private ArrayList<Vehiculo> deserializarVehiculos(String arrayJsonSerializado) {
        Vehiculo[] misVehiculos = new Gson().fromJson(arrayJsonSerializado, Vehiculo[].class);
        ArrayList<Vehiculo> lista_vehiculos = new ArrayList<>();

        for (int i = 0; i < misVehiculos.length; i++) {
            lista_vehiculos.add(misVehiculos[i]);
        }
        return lista_vehiculos;
    }

    private Conductor parseToConductor(String json) {
        Gson gson = new Gson();
        Properties propiedades = gson.fromJson(json, Properties.class);

        String cedula = propiedades.getProperty("cedula");
        String nombres = propiedades.getProperty("nombres");
        String apellidos = propiedades.getProperty("apellidos");
        String genero = propiedades.getProperty("genero");
        String fechaNaci = propiedades.getProperty("fechaNaci");
        Conductor miConductor = new Conductor(cedula, nombres, apellidos, genero, fechaNaci);
        return miConductor;
    }
}
