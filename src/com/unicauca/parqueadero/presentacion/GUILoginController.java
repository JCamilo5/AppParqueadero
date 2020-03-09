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
    private String estrategia;

    public GUILoginController(GUIAutenticacion vista, GestorUsuarios modelo, GUIMenu menu) {
        this.vista = vista;
        this.modelo = modelo;
        this.menu = menu;
        utilidades = new Utilidades();
        estrategia = "Entrada";

    }

    public void iniciar() {
        vista.setTitle("INICIAR SESION");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
        asignarBotones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Ingresar":
                String usuario = vista.getUsuer();
                String password = vista.getPassword();

                if (modelo.consultarUsuario(usuario, password) != null) {
                    if(vista.getSalida().isSelected()){
                        menu.setUbicacion("Salida");
                    }else{
                        menu.setUbicacion("Entrada");
                    }
                    menu.setPrivilegio(modelo.consultarUsuario(usuario, password).getPrivilegio());
                    menu.usuario_activo(usuario); 
                    vista.dispose();
                    menu.iniciar();

                } else {
                    utilidades.mensajeError("Usuario / Contraseña Incorrectos", "Error de Autenticacion");
                }
                break;
            
            case "Entrada":
                Utilidades.estrategia = "Entrada";
                break;
            
            case "Salida":
                Utilidades.estrategia = "Salida";
                break;
        }

    }

    public void asignarBotones() {
        vista.getIngresar().addActionListener(this);
        vista.getSalida().addActionListener(this);
        vista.getEntrada().addActionListener(this);

        vista.getEntrada().setActionCommand("Entrada");
        vista.getSalida().setActionCommand("Salida");
        vista.getBotonIngresar().setActionCommand("Ingresar");
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

}
