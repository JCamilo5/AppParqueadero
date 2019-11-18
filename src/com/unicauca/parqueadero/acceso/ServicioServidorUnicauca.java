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
public class ServicioServidorUnicauca implements IServiciosUsuario, IServiciosConductores{

    private Socket socket;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    
    /**
     * Establece la conexión con el servidor.
     * @param direccion
     * @param puerto
     * @throws IOException 
     */
    private void conectar(String direccion, int puerto) throws IOException 
    {
        socket = new Socket(direccion, puerto);
        System.out.println("Conectado...");
    }
     /**
     * Lee los flujos de entrada y salida.
     * @param accion
     * @return String
     * @throws IOException 
     */
    private String leerFlujoEntradaSalida(String accion) throws IOException
    {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        //Usando protocolo de comunicación
        salidaDecorada.println(accion);
        if(entradaDecorada.hasNextLine()) {
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
        }
        catch(IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex); 
        }    
    }
    /**
     * Consultar si se tiene registrado el usuario que se manda desde la autenticacion
     * @param usuario usuario
     * @param password  contraseña
     * @return 
     */
    @Override
    public String consultarUsuario(String usuario, String password) {
        String respuesta = null;
        String accion = "Consultar Usuario";
        try 
        {
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(accion + "," + usuario + ","+password);
            cerrarFlujos();
            desconectar();
        }
        catch(IOException ex) {
            Logger.getLogger(ServicioServidorUnicauca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;  
    }

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
    public String consultarVehiculoCon(String cedula){
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
    
}
