/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.IServiciosUsuario;
import com.unicauca.parqueadero.acceso.ServicioServidorUnicauca;
import com.google.gson.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import mvcf.AModel;

/**
 *
 * @author JuanCamilo
 */
public class GestorUsuarios  extends AModel{
    
    private final IServiciosUsuario servicioUsuarios;
    private String respuesta;
    
    public GestorUsuarios(){
        servicioUsuarios = new ServicioServidorUnicauca();
        respuesta = "";
    }
    
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
    public boolean existeUsuario(String usuario,String password){
        boolean existe = false;
        Usuario miUsuario = consultarUsuario(usuario, password);
        if(miUsuario != null){
            existe = true;
        }
        return existe;
    }
    
    /**
     * Metodo que devuelve un usuario
     * @param usuario usuario por el cual se desea buscar
     * @param password contraseña de ese usuario
     * @return usuario
     */
    public Usuario consultarUsuario(String usuario,String password){
        String json = servicioUsuarios.consultarUsuario(usuario, password);
        Usuario miUsuario = null;
        if(!json.equals("No se encontro el usuario")){
            miUsuario = parseToUsuario(json);
        }
        else{
            respuesta = json;
        }
        return miUsuario;
    }
    private Usuario parseToUsuario(String json){
        Gson gson = new Gson();
        Properties propiedades = gson.fromJson(json, Properties.class);
        String cedula = propiedades.getProperty("cedula");
        String nombres = propiedades.getProperty("nombres");
        String apellidos = propiedades.getProperty("apellidos");
        String fechaNaci = propiedades.getProperty("fechaNaci");
        String user = propiedades.getProperty("user");
        String password = propiedades.getProperty("password");
        String privilegio = propiedades.getProperty("privilegio");
        
        Usuario miUsuario = new Usuario(cedula,nombres,apellidos,fechaNaci,user,password,privilegio);
        return miUsuario; 
    } 
}
