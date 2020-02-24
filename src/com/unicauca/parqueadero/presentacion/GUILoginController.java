/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqueadero.negocio.GestorUsuarios;
import com.unicauca.parqueadero.utilidades.Utilidades;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;

/**
 *
 * @author Personal
 */
public class GUILoginController implements ActionListener {

    private GUIAutenticacion vista;
    private GestorUsuarios modelo;
    private Utilidades utilidades;
    private GUIMenu menu;
    
    public GUILoginController(GUIAutenticacion vista, GestorUsuarios modelo,GUIMenu menu){
        this.vista = vista;
        this.modelo = modelo;
        this.menu = menu;
        utilidades = new Utilidades();
        this.vista.getIngresar().addActionListener(this);
    }
    public void iniciar(){
        vista.setTitle("INICIAR SESION");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = vista.getUsuer();
        String password = vista.getPassword();
        
        if(modelo.consultarUsuario(usuario, password) != null){
            vista.dispose();
            menu.setPrivilegio(modelo.consultarUsuario(usuario, password).getPrivilegio());
            menu.usuario_activo(usuario);
            Utilidades.usuario = modelo.consultarUsuario(usuario, password);
            menu.iniciar();
            
        }else{
            utilidades.mensajeError("Usuario / Contraseña Incorrectos", "Error de Autenticacion");
        }
        
    }

  

    

}

