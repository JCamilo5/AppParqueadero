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
public class GestorConductor extends java.util.Observable {

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

    /**
     * Metodo que inserta un nuevo conductor,le pasa los datos al servidor
     *
     * @param cedula
     * @param nombres
     * @param apellidos
     * @param genero
     * @param fechaNaci
     * @return true si la insercion es exitosa, false si falla
     */
    public boolean agregarConductor(String cedula, String nombres, String apellidos, String genero, String fechaNaci) {
        boolean exito = false;
        respuesta = servicioConductores.agregarConductor(cedula, nombres, apellidos, genero, fechaNaci);
        if (!respuesta.equals("Error")) {
            exito = true;
        }
        return exito;
    }

    /**
     * Metodo que retorna el rol con mayor prioridad de un conductor
     *
     * @param cedula
     * @return
     */
    public boolean asociarRol(String cedula, String rol) {
        boolean exito = false;
        respuesta = servicioConductores.asociarRol(cedula, rol);
        if (!respuesta.equals("Error")) {
            exito = true;
        }

        return exito;
    }

    /**
     * Agregar un vehiculo a un conductor
     *
     * @param cedula cedula del conductor
     * @param placa placa del vehiculo
     * @param marca marca del vehiculo
     * @param tipo tipo de vehiculo
     * @return respuesta del servidor
     */
    public boolean agregarVehiculo(String placa, String marca, String tipo) {
        boolean exito = false;
        respuesta = servicioConductores.agregarVehiculo(placa, marca, tipo);
        if (!respuesta.equals("Error")) {
            exito = true;
        }
        return exito;
    }

    public boolean agregarMulta(String placa, String descripcion, String foto) {
        boolean exito = false;
        respuesta = servicioConductores.agregarMulta(placa, descripcion, foto);
        if (!respuesta.equals("Error")) {
            exito = true;
        }
        return exito;
    }

    /**
     * Metodo que asocia un vehiculo con un conductor
     *
     * @param cedula cedula del conductor
     * @param placa placa del vehiculo
     * @return true si el proceso exitoso false de lo contrario
     */
    public boolean asociarVehiCond(String cedula, String placa) {
        boolean exito = false;
        respuesta = servicioConductores.asociarVehiCond(cedula, placa);
        if (!respuesta.equals("Error")) {
            exito = true;
            setChanged();
            notifyObservers();
        }

        return exito;
    }

    public ArrayList<Informe> obtenerInforme(String cedula) {
        String arrayJson = servicioConductores.consultarInforme(cedula);
        ArrayList<Informe> lista_informe = new ArrayList<>();
        if (!arrayJson.equals("Vacio")) {
            try {
                lista_informe = deserealizarInforme(arrayJson);
            } catch (Exception e) {

            }
        } else {
            respuesta = arrayJson;
        }
        return lista_informe;
    }

    /**
     * Metodo que busca un conductor
     *
     * @param cedula parametro por el cual se hace la busqueda
     * @return Conductor
     */
    public Conductor consultarConductor(String cedula) {
        Conductor miConductor = null;
        String json = servicioConductores.consultarConductor(cedula);
        if (!json.equals("No se encontro a ningun conductor con esa cedula")) {
            try {
                miConductor = parseToConductor(json);
            } catch (Exception e) {

            }
        } else {
            respuesta = json;
        }
        return miConductor;
    }

    /**
     * Metodo que retorna los vehiculoas asociados a una cedula
     *
     * @param cedula criterio de busqueda
     * @return arreglo de vehiculos
     */
    public ArrayList<Vehiculo> obtenerVehiculosCon(String cedula) {
        String arrayJson = servicioConductores.consultarVehiculoCon(cedula);
        ArrayList<Vehiculo> lista_vehiculos = new ArrayList<>();

        if (!arrayJson.equals("El conductor no tiene asociado ningun vehiculo")) {
            try {
                lista_vehiculos = deserializarVehiculos(arrayJson);
            } catch (Exception e) {

            }
            listaVehiculos = lista_vehiculos;

        } else {
            respuesta = arrayJson;
        }
        return lista_vehiculos;
    }

    /**
     * Metodo que retorna las multas asociadas a un vehiculo
     *
     * @param placa criterio de busqueda
     * @return multas asociadas
     */
    public ArrayList<Multa> obtenerMultas(String placa) {
        String arrayJson = servicioConductores.consultarMultas(placa);
        ArrayList<Multa> lista_multas = new ArrayList<>();
        if (!arrayJson.equals("Vacio")) {
            try {
                lista_multas = deserealizarMutas(arrayJson);
            } catch (Exception e) {

            }
        } else {
            respuesta = arrayJson;
        }
        return lista_multas;

    }

    private ArrayList<Informe> deserealizarInforme(String arrayJsonSerializado) {
        Informe[] misInfromes = new Gson().fromJson(arrayJsonSerializado, Informe[].class);
        ArrayList<Informe> lista_informe = new ArrayList<>();
        for (int i = 0; i < misInfromes.length; i++) {
            lista_informe.add(misInfromes[i]);
        }
        return lista_informe;
    }

    /**
     * Metodo qeu deserealiza las multas en formato json
     *
     * @param arrayJsonSerializado multas en formato json
     * @return multas
     */
    private ArrayList<Multa> deserealizarMutas(String arrayJsonSerializado) {
        Multa[] misMultas = new Gson().fromJson(arrayJsonSerializado, Multa[].class);
        ArrayList<Multa> lista_multas = new ArrayList<>();
        for (int i = 0; i < misMultas.length; i++) {
            lista_multas.add(misMultas[i]);
        }
        return lista_multas;
    }

    /**
     * Metodo que deserializa un vehiculo en formato json
     *
     * @param arrayJsonSerializado vehiculo serializado
     * @return vehiculo
     */
    private ArrayList<Vehiculo> deserializarVehiculos(String arrayJsonSerializado) {
        Vehiculo[] misVehiculos = new Gson().fromJson(arrayJsonSerializado, Vehiculo[].class);
        ArrayList<Vehiculo> lista_vehiculos = new ArrayList<>();

        for (int i = 0; i < misVehiculos.length; i++) {
            lista_vehiculos.add(misVehiculos[i]);
        }
        return lista_vehiculos;
    }

    /**
     * Metodo que deserealiza un conductor serializado en json
     *
     * @param json conductor serializado
     * @return conductor
     */
    private Conductor parseToConductor(String json) {
        Gson gson = new Gson();
        Properties propiedades = gson.fromJson(json, Properties.class);

        String cedula = propiedades.getProperty("cedula");
        String nombres = propiedades.getProperty("nombres");
        String apellidos = propiedades.getProperty("apellidos");
        String genero = propiedades.getProperty("genero");
        String fechaNaci = propiedades.getProperty("fechaNaci");
        String rol = propiedades.getProperty("rol");
        Conductor miConductor = new Conductor(cedula, nombres, apellidos, genero, fechaNaci, rol);
        return miConductor;
    }
}
