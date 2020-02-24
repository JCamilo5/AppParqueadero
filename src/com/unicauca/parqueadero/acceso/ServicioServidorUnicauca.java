/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCamilo
 */
public class ServicioServidorUnicauca implements IServiciosUsuario, IServiciosConductores, IServiciosParqueadero, IServicioVigilantes {

    private Socket socket;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;

    /**
     * Establece la conexión con el servidor.
     *
     * @param direccion
     * @param puerto
     * @throws IOException
     */
    private void conectar(String direccion, int puerto) throws IOException {
        socket = new Socket(direccion, puerto);
        System.out.println("Conectado...");
    }

    /**
     * Lee los flujos de entrada y salida.
     *
     * @param accion
     * @return String
     * @throws IOException
     */
    private String leerFlujoEntradaSalida(String accion) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        //Usando protocolo de comunicación
        salidaDecorada.println(accion);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }

        return respuesta;
    }

    /**
     * Cierra los flujos en entrada y salida
     */
    private void cerrarFlujos() {
        salidaDecorada.close();
        entradaDecorada.close();
    }

    /**
     * Cierra la conexion
     */
    private void desconectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Consultar si se tiene registrado el usuario que se manda desde la
     * autenticacion
     *
     * @param usuario usuario
     * @param password contraseña
     * @return
     */
    @Override
    public String consultarUsuario(String usuario, String password) {
        String respuesta = null;
        String accion = "Consultar Usuario";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + usuario + "," + password);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Metodo que consulta un conductor teniedno como criterio su cedula
     *
     * @param cedula cedula digitada desde la interfaz GUIBusquedaConductor
     * @return
     */
    @Override
    public String consultarConductor(String cedula) {
        String respuesta = null;
        String accion = "Consultar Conductor";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + cedula);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String consultarTodosConductores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarVehiculoCon(String cedula) {
        String respuesta = null;
        String accion = "Consultar Vehiculos de Conductor";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + cedula);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String consultarRoles(String cedula) {
        String respuesta = null;
        String accion = "Consultar Roles";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + cedula);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String agregarUsuario() {
        return " ";
    }

    @Override
    public String agregarConductor(String cedula, String nombres, String apellidos, String genero, String fechaNaci) {
        String respuesta = null;
        String accion = "Registrar Conductor";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + cedula + "," + nombres + "," + apellidos + "," + genero + "," + fechaNaci);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String agregarVehiculo(String placa, String marca, String tipo) {
        String respuesta = null;
        String accion = "Agregar Vehiculo";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + placa + "," + marca + "," + tipo);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String asociarVehiCond(String cedula, String placa) {
        String respuesta = null;
        String accion = "Asociar Vehiculo";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + cedula + "," + placa);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String ingresarVehiculo(String cedula,String placa, String bahia) {
        String respuesta = null;
        String accion = "Ingresar Vehiculo";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," +cedula+","+ placa + "," + bahia);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String obtenerOcupados() {
        String respuesta = null;
        String accion = "Obtener Ocupados";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String asociarRol(String cedula, String rol) {
        String respuesta = null;
        String accion = "Asociar Rol";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion+","+cedula+","+rol);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public String agregarVigilante(String ced, String emp, String usua, String noms, String apells, String genero, String fechaNaci, String contra, String puesto) {
        String respuesta = null;
        String accion = "Agregar Vigilante";
        try {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion+","+ced+","+emp+","+usua+","+noms+","+apells+","+genero+","+fechaNaci+","+contra+","+puesto);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

   

}
