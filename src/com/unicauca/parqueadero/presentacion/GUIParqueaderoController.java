/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;


import com.unicauca.parqueadero.negocio.Bahia;
import com.unicauca.parqueadero.negocio.Parqueadero;
import com.unicauca.parqueadero.utilidades.Utilidades;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

    public GUIParqueaderoController(GUIParqueadero vista,Parqueadero modelo) {
        this.modelo = modelo;
        this.vista = vista;

    }

    public void iniciar() {
        asignarBotones();
        vista.setTitle("ASIGNACION DE PUESTO");
        vista.setSize(572, 500);
        vista.setVisible(true);
        cargarOcupados();
        //Mandar el hilo
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JToggleButton aux = (JToggleButton) e.getSource();
        String tmp = aux.getText();
        int opc = Utilidades.mensajeConfirmacion("Seguro que desea asignar el puesto: " + tmp + ".", "MENSAJE DE CONFIRMACION");
        if(opc == 0){
            int puesto = Integer.parseInt(tmp);
            vista.cambiarColor(puesto-1);
            if(modelo.registrarIngreso(cedula, placa, tmp)){
                Utilidades.mensajeExito("Asignacion Exitosa", "Proceso Exitoso");
            }else{
                Utilidades.mensajeError("Un error inesperado ha ocurrido", "Proceso Fallido");
            }
            
            vista.dispose();
        }else{
            vista.habilitar(Integer.parseInt(tmp)-1);
        }
    }

    private void asignarBotones() {

        ArrayList<JToggleButton> aux = vista.getBotones();
        for (int i = 0; i < aux.size(); i++) {
            aux.get(i).addActionListener(this);
        }
    }
    public void cargarOcupados(){
        ArrayList<Bahia> aux = modelo.obtenerOcupados();
        for (int i = 0; i < aux.size(); i++) {
             if(vista.getBotones().get(i).getText().equals(aux.get(i).getIdentificador())){
                vista.cambiarColor(i);
            }
        }
    }

    public void mostrarMapa() {
        GUIParqueadero p = new GUIParqueadero();
        ArrayList<Bahia> aux = modelo.obtenerOcupados();
        for (int i = 0; i < aux.size(); i++) {
            if(p.getBotones().get(i).getText().equals(aux.get(i).getIdentificador())){
                p.cambiarColor(i);
            }
        }
        p.setTitle("Mapa Parqueadero");
        p.setSize(572, 500);
        esta_habilitada(p);
        p.setVisible(true);
    }

    private void esta_habilitada(GUIParqueadero p) {

        for (Component component : p.getPanel().getComponents()) {
            component.setEnabled(false);
        }
    }

}
