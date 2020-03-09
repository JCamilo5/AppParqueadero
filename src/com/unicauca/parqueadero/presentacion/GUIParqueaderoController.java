/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqueadero.negocio.EstrategiaParqueadero;
import com.unicauca.parqueadero.negocio.Bahia;
import com.unicauca.parqueadero.negocio.EstrategiaFactory;
import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.utilidades.Utilidades;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JToggleButton;

/**
 *
 * @author JuanCamilo
 */
public class GUIParqueaderoController implements ActionListener {
    
    private GUIParqueadero vista;
    private Parqueadero modelo;
    private String placa;
    private String cedula;
    private EstrategiaParqueadero estrategia;
    private EstrategiaFactory factory;
    
    public GUIParqueaderoController(GUIParqueadero vista, Parqueadero modelo,EstrategiaFactory factory) {
        this.modelo = modelo;
        this.vista = vista;
        this.factory = factory;
        
    }
    
    public void iniciar() {
        asignarBotones();
        vista.setTitle("GESTION DE PUESTOS");
        vista.setSize(572, 500);
        vista.setVisible(true);
        estrategia = factory.getEstrategia(Utilidades.estrategia);
        vista.setController(this);
        vista.setEstrategia(estrategia);
        estrategia.cargarPuesto(modelo, vista, this);
       
    }
    public void lanzarHilo(){
        modelo.schedule(3);
    }
    public void detenrHilo(){
        modelo.stop();
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCedula() {
        return cedula;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        JToggleButton aux = (JToggleButton) e.getSource();
        String puesto = aux.getText();
        estrategia.procesar(puesto, modelo, vista, this);
        /*
        int opc = Utilidades.mensajeConfirmacion("Seguro que desea asignar el puesto: " + tmp + ".", "MENSAJE DE CONFIRMACION");
        if (opc == 0) {
            int puesto = Integer.parseInt(tmp);
            vista.cambiarColor(puesto - 1);
            if (modelo.registrarIngreso(cedula, placa, tmp)) {
                Utilidades.mensajeExito("Asignacion Exitosa", "Proceso Exitoso");
                vista.dispose();
            } else {
                Utilidades.mensajeError("Un error inesperado ha ocurrido", "Proceso Fallido");
            }
            
            vista.dispose();
        } else {
            vista.habilitar(Integer.parseInt(tmp) - 1);
        }*/
    }
    
    private void asignarBotones() {
        
        ArrayList<JToggleButton> aux = vista.getBotones();
        for (int i = 0; i < aux.size(); i++) {
            aux.get(i).addActionListener(this);
        }
    }
    
    public void mostrarMapa() {
        GUIParqueadero p = new GUIParqueadero();
        ArrayList<Bahia> aux = modelo.obtenerOcupados();
        for (int i = 0; i < aux.size(); i++) {
            for (int j = 0; j < p.getBotones().size(); j++) {
                if (p.getBotones().get(j).getText().equals(aux.get(i).getIdentificador())) {
                    p.cambiarColor(j);
                }
            }
            
        }
        p.setTitle("Mapa Parqueadero");
        p.setSize(572, 500);
        esta_habilitada(p);
        p.setVisible(true);
    }
    
    public void esta_habilitada(GUIParqueadero p) {
        for (int i = 0; i < p.getZonas().size(); i++) {
            for (Component component : p.getZonas().get(i).getComponents()) {
                component.setEnabled(false);
            }            
        }
        
    }
    public javax.swing.JFrame getVista(){
        asignarBotones();
        vista.setTitle("GESTION DE PUESTOS");
        vista.setSize(572, 500);
        vista.setLocationRelativeTo(null);
        estrategia = factory.getEstrategia(Utilidades.estrategia);
        estrategia.cargarPuesto(modelo, vista, this);
        
        return this.vista;
    }
    public Parqueadero getGestor(){
        return this.modelo;
    }
    

  
    
}
