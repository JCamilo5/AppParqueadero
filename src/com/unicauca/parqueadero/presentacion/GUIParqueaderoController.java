/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

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
import com.unicauca.parqueadero.negocio.IEstrategiaParqueadero;

/**
 *
 * @author JuanCamilo
 */
public class GUIParqueaderoController implements ActionListener {
    
    private GUIParqueadero vista;
    private Parqueadero modelo;
    private String placa;
    private String cedula;
    private IEstrategiaParqueadero estrategia;
    private EstrategiaFactory factory;
    
    public GUIParqueaderoController(GUIParqueadero vista, Parqueadero modelo,EstrategiaFactory factory) {
        this.modelo = modelo;
        this.vista = vista;
        this.factory = factory;
        asignarBotones();
    }
    
    public void iniciar() {
        
        vista.setTitle("GESTION DE PUESTOS");
        vista.setSize(572, 500);       
        estrategia = factory.getEstrategia(Utilidades.estrategia);
        vista.setEstrategia(estrategia);
        estrategia.cargarPuesto(vista);
        System.out.println("Pongo visible");
        vista.setVisible(true);
        //hilo.start();
        
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
        estrategia.procesar(puesto,vista,this);
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
        GUIParqueadero v = new GUIParqueadero();
        IEstrategiaParqueadero esAux = factory.getEstrategia(Utilidades.estrategia);
        v.setEstrategia(esAux);
        esAux.cargarPuesto(v);
        
        v.setTitle("Mapa Parqueadero");
        v.setSize(572, 500);
        v.deshabilitarVista();
        v.setVisible(true);
    }
    

    public javax.swing.JFrame getVista(){
        asignarBotones();
        vista.setTitle("GESTION DE PUESTOS");
        vista.setSize(572, 500);
        vista.setLocationRelativeTo(null);
        estrategia = factory.getEstrategia(Utilidades.estrategia);
        estrategia.cargarPuesto(vista);
        
        return this.vista;
    }
    public Parqueadero getGestor(){
        return this.modelo;
    }
  
    
}
